package comiam.janne.network;

import java.util.ArrayList;
import java.util.List;

import comiam.janne.base.Layer;
import comiam.janne.base.Neuron;
import comiam.janne.base.Synapse;

public class NeuralNetwork {
	
	public List<Layer> rawNeuralNetwork = new ArrayList<Layer>();
	public List<Synapse> synapses = new ArrayList<Synapse>();
	
	public Neuron getNeuron(int layer, int id)
	{
		return rawNeuralNetwork.get(layer).get(id);
	}
	
	public double getWeightSynapse(Neuron output, Neuron input)
	{
		for(Synapse synapse : synapses)
		{
			if(synapse.layer0 == output.layer && synapse.neuronID0 == output.ID &&
					synapse.layer1 == input.layer && synapse.neuronID1 == input.ID)
				return synapse.weight;
		}
		return 0;
	}
	
	public Neuron[] getGetters(Neuron output)
	{
		ArrayList<Neuron> getters = new ArrayList<Neuron>();
		synapses.forEach((synapse) -> {
			if(synapse.layer0 == output.layer && synapse.neuronID0 == output.ID)
				getters.add(getNeuron(synapse.layer1, synapse.neuronID1));
		});
		if(getters.size() > 0)
			return (Neuron[]) getters.toArray(new Neuron[getters.size()]);
		else
			return null;
	}
	
	public Neuron[] getSetters(Neuron input)
	{
		ArrayList<Neuron> setters = new ArrayList<Neuron>();
		synapses.forEach((synapse) -> {
			if(synapse.layer1 == input.layer && synapse.neuronID1 == input.ID)
				setters.add(getNeuron(synapse.layer0, synapse.neuronID0));
		});
		return (Neuron[]) setters.toArray(new Neuron[setters.size()]);
	}
	
	public static Neuron[][] compileNeuronNetwork(NeuralNetwork net)
	{
		Neuron[][] netc = new Neuron[net.rawNeuralNetwork.size()][];
		for(int i = 0;i < net.rawNeuralNetwork.size();i++)
		{
			netc[i] = (Neuron[]) net.rawNeuralNetwork.get(i).toArray(new Neuron[net.rawNeuralNetwork.get(i).size()]);
		}
		return netc;
	}

}
