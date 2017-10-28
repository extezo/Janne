import java.util.ArrayList;
import java.util.List;

import comiam.janne.base.ActivationType;
import comiam.janne.base.Layer;
import comiam.janne.creator.NetworkCreator;
import comiam.janne.network.NetworkExecutor;
import comiam.janne.network.NeuralNetwork;

public class Debug {

	public static void main(String[] args) {
		List<Layer> layers = new ArrayList<Layer>();
		layers.add(Layer.createLayer(2, ActivationType.Sigmoid_Activation, 1));
		layers.add(Layer.createLayer(4, ActivationType.Sigmoid_Activation, 1));
		layers.add(Layer.createLayer(4, ActivationType.Sigmoid_Activation, 1));
		layers.add(Layer.createLayer(1, ActivationType.Sigmoid_Activation, 1));
		
		NeuralNetwork net = NetworkCreator.createPerseptron(layers);
		for(double a : NetworkExecutor.execANN(net, 0.224, 0.224))
			System.out.println(a);
	}

}
