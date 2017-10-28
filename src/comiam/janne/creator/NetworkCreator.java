package comiam.janne.creator;

import java.util.ArrayList;
import java.util.List;

import comiam.janne.base.Layer;
import comiam.janne.base.NeuronType;
import comiam.janne.base.Synapse;
import comiam.janne.io.IO;
import comiam.janne.network.NeuralNetwork;

public class NetworkCreator {

	public static NeuralNetwork createPerseptron(List<Layer> layers)
	{
		NeuralNetwork net = new NeuralNetwork();
		List<Synapse> synapses = new ArrayList<Synapse>();
		
		for(Layer layer : layers)
		{
			if(layer.isEmpty())
			{
				IO.error("The neural network mustn't contain empty layers!!!");
				return null;
			}
		}
		
		for(int i = 0;i < layers.size();i++)
		{
			for (int j = 0; j < layers.get(i).size(); j++) {
				layers.get(i).get(j).layer = i;
				if(i == 0)
					layers.get(i).get(j).type = NeuronType.Input;
				else if(i == layers.size() - 1)
					layers.get(i).get(j).type = NeuronType.Output;
				else
					layers.get(i).get(j).type = NeuronType.Hidden;
			}
		}
		
		for(int i = 0;i < layers.size() - 1;i++)
		{
			for (int j = 0; j < layers.get(i).size(); j++) {
				for (int j2 = 0; j2 < layers.get(i + 1).size(); j2++) {
					synapses.add(new Synapse(layers.get(i).get(j).layer, layers.get(i + 1).get(j2).layer,
							layers.get(i).get(j).ID, layers.get(i + 1).get(j2).ID, Math.random()));
				}
			}
		}
		net.rawNeuralNetwork = layers;
		net.synapses = synapses;
		return net;
	}
	
}
