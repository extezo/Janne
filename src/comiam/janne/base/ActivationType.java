package comiam.janne.base;

public enum ActivationType {
	Line_Activation,
	Sigmoid_Activation,
	HyperbolicTangent_Activation,
	BIAS_Activation;
	
	public static double engineActivation(ActivationType type, double input, double steepness)
	{
		switch(type)
		{
		case BIAS_Activation:
			return 1;
		case HyperbolicTangent_Activation:
			double exp = (Math.exp(2*(input / steepness)));
			return (exp-1)/(exp+1);
		case Line_Activation:
			return input;
		case Sigmoid_Activation:
			return 1/(1+(Math.exp(-steepness * input)));
		default:
			return -1;
		
		}
	}
}
