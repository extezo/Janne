package comiam.janne.base;

public class Neuron {
	
	public static final double DEFAULT_ACTIVATION_STEEPNESS = 1F;
	public ActivationType typeActivation;
	public NeuronType type;
	public int ID, layer;
	public double gettedValue, createdValue;
	public double steepness = DEFAULT_ACTIVATION_STEEPNESS;
	
	public Neuron()
	{
		this(-1, -1, DEFAULT_ACTIVATION_STEEPNESS, NeuronType.Unknown, ActivationType.Sigmoid_Activation);
	}
	
	public Neuron(int ID, double steepness, ActivationType atype)
	{
		this(ID, -1, steepness, NeuronType.Unknown, atype);
	}
	
	public Neuron(int ID, int layer, double steepness, NeuronType ntype, ActivationType atype)
	{
		this.ID = ID;
		this.layer = layer;
		this.type = ntype;
		this.typeActivation = atype;
	}
	
	public void runActivationFunction()
	{
		createdValue = ActivationType.engineActivation(typeActivation, gettedValue, steepness);
	}

}
