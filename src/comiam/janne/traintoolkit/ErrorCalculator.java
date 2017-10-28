package comiam.janne.traintoolkit;

public class ErrorCalculator {
	
	public static double MSE(double[] idealEpoch, double[] actualEpoch)
	{
		double num = 0;
		for (int i = 0; i < idealEpoch.length; i++) {
			num += (idealEpoch[i] - actualEpoch[i]) * (idealEpoch[i] - actualEpoch[i]);
		}
		return num / idealEpoch.length;
	}
	
	public static double RootMSE(double[] idealEpoch, double[] actualEpoch)
	{
		double num = 0;
		for (int i = 0; i < idealEpoch.length; i++) {
			num += (idealEpoch[i] - actualEpoch[i]) * (idealEpoch[i] - actualEpoch[i]);
		}
		return Math.sqrt(num / idealEpoch.length);
	}

}
