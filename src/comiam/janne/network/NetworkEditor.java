package comiam.janne.network;

import comiam.janne.base.Layer;
import comiam.janne.base.Neuron;
import comiam.janne.base.Synapse;

public class NetworkEditor {
	
	public static void createSynapse(NeuralNetwork net, Neuron output, Neuron input)
	{
		net.synapses.forEach((synapse) -> {
			if(synapse.layer0 == output.layer && synapse.neuronID0 == output.ID && 
					synapse.layer1 == input.layer && synapse.neuronID1 == input.ID)
				return;
		});
		net.synapses.add(new Synapse(output.layer, output.ID, input.layer, input.ID, Math.random()));
	}
	
	public void removeNeuron(NeuralNetwork net, Neuron neuron)
	{
		removeNeuron(net, neuron.layer, neuron.ID);
	}
	
	public void removeNeuron(NeuralNetwork net, int layer, int ID)
	{
		net.rawNeuralNetwork.get(layer).remove(ID);
		for(int i = 0;i < net.rawNeuralNetwork.get(layer).size();i++)
			net.rawNeuralNetwork.get(layer).get(i).ID = i;
	}
	
	public void addNeuron(NeuralNetwork net, Neuron neuron, int layer)
	{
		if(layer < 0)return;
		
		if(net.rawNeuralNetwork.size() <= layer)
		{
			if(net.rawNeuralNetwork.size() == layer)
				net.rawNeuralNetwork.add(new Layer());
			else
				for(int i = 0;i < layer - net.rawNeuralNetwork.size() + 1;i++)
					net.rawNeuralNetwork.add(new Layer());
		}
		
		net.rawNeuralNetwork.get(layer).add(neuron);
	}

}
