package comiam.janne.base;

public class Synapse {
	
	public int layer0, layer1;
	public int neuronID0, neuronID1;
	public double weight;
	
	public Synapse(int layer0, int layer1, int neuronID0, int neuronID1, double weight)
	{
		this.layer0 = layer0;
		this.layer1 = layer1;
		this.neuronID0 = neuronID0;
		this.neuronID1 = neuronID1;
		this.weight = weight;
	}

}
