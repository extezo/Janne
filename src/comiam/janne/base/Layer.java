package comiam.janne.base;

import java.util.ArrayList;

public class Layer extends ArrayList<Neuron> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2532848295824202057L;

	public static Layer createLayer(int size, ActivationType atype, double steepness)
	{
		Layer result = new Layer();
		for(int i = 0;i < size;i++)
			result.add(new Neuron(i, steepness, atype));
		return result;
	}
	
}
