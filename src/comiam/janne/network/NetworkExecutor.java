package comiam.janne.network;

import comiam.janne.base.Neuron;
import comiam.janne.io.IO;

public class NetworkExecutor {
	
	public static double[] execANN(NeuralNetwork net, double...inputData)
	{
		Neuron[][] compiledNeurons = NeuralNetwork.compileNeuronNetwork(net);
		
		if(compiledNeurons[0].length < inputData.length)
		{
			IO.error("Not enough input data for input layer(" + compiledNeurons[0].length +
					" neurons : " + inputData.length + " args)!!!");
			return new double[0];
		}
		else if(compiledNeurons[0].length > inputData.length)
		{
			IO.error("Input data length is longer than input layer length(" + compiledNeurons[0].length 
					+" neurons : " + inputData.length + " args)!!!");
			return new double[0];
		}
		
		for(int i = 0;i < compiledNeurons[0].length;i++)
		{
			if(Math.abs(inputData[i]) > 1)
				inputData[i] = 1 / inputData[i];
			compiledNeurons[0][i].gettedValue = inputData[i];
		}
				
		for(int i = 0;i < compiledNeurons.length;i++)
		{
			for (int j = 0; j < compiledNeurons[i].length; j++) 
			{
				compiledNeurons[i][j].runActivationFunction();
				Neuron[] getters = net.getGetters(compiledNeurons[i][j]);
				if(getters != null)
					for(Neuron n : getters)
					{
						n.gettedValue += net.getWeightSynapse(compiledNeurons[i][j], n) * compiledNeurons[i][j].createdValue;
					}
			}
		}
		double[] result = new double[compiledNeurons[compiledNeurons.length - 1].length];
		for(int i = 0;i < result.length;i++)
		{
			result[i] = compiledNeurons[compiledNeurons.length - 1][i].createdValue;
		}
		
		return result;
	}

}
