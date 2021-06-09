import java.util.ArrayList;

public class Perceptron {
	private static double[] weights;
	private static ArrayList<double[]> inputs;
	private static int[] labels;
	private static double bias;
	private static double learning_rate;
	private static int threshold;
	
	public Perceptron(int t, int lr)
	{
		weights =  new double[2];
		threshold = t;
		learning_rate = lr;
		bias = 0;
		System.out.println("Initial weights: " + weights[0] + ", " + weights[1]);
		System.out.println("Initial bias: " + bias);
		System.out.println("Threshold: " + threshold);
		System.out.println("Learning rate: " + learning_rate + "\n");
	}
	
	public int predict(double[] input)
	{
		double z = input[0] * weights[0] + input[1] * weights[1] + bias;
		System.out.println("z = " + input[0] + " * " + weights[0] + " + " + input[1]
				+ " * " + weights[1] + " + " + bias + " = " + z);
		int yhat = 0;
		if (z>0)
		{
			yhat = 1;
		}
		return yhat;
	}
	
	public void train()
	{
		for(int i = 0; i<threshold; i++)
		{
			System.out.println("===================Training Iteration: " + i + "=======================");
			for(int j = 0; j<inputs.size(); j++)
			{
				System.out.println("Using Input: [" + inputs.get(j)[0] + ", " + inputs.get(j)[1]
						+ "] and Weights: [" + weights[0] + ", " + weights[1] + "]");
				int yhat = predict(inputs.get(j));
				System.out.println("Activation(yhat) = " + yhat);
				int error = labels[j] - yhat;
				System.out.println("Error = " + labels[j] + " - " + yhat + " = " + error + "\n");
				weights[0] = weights[0] + learning_rate * error * inputs.get(j)[0];
				weights[1] = weights[1] + learning_rate * error * inputs.get(j)[1];
				bias = bias + learning_rate * error;
			}
		}
	}
	
	public static void main(String[] args)
	{
		//AND, a & b
		labels = new int[] {1, 0, 0, 0};
		//OR, a || b
		labels = new int[] {1, 1, 1, 0};
		//XOR, !(a || b)
		labels = new int[] {0, 0, 0, 1};
		//NAND, !(a && b)
		//labels = new int[] {0, 1, 1, 1};
		
		inputs = new ArrayList<>();
		inputs.add(new double[] {1, 1});
		inputs.add(new double[] {1, 0});
		inputs.add(new double[] {0, 1});
		inputs.add(new double[] {0, 0});
		
		Perceptron p = new Perceptron(100, 1);
		p.train();
		
		double a = 1; double b = 1;
		System.out.println("----------Input----------- [" + a + ", " + b + "]");
		int output = p.predict(new double[] {a, b});
		System.out.println("----------Output----------- " + output + "\n");
		a = 1; b = 0;
		System.out.println("----------Input----------- [" + a + ", " + b + "]");
		output = p.predict(new double[] {a, b});
		System.out.println("----------Output----------- " + output + "\n");
		a = 0; b = 1;
		System.out.println("----------Input----------- [" + a + ", " + b + "]");
		output = p.predict(new double[] {a, b});
		System.out.println("----------Output----------- " + output + "\n");
		a = 0; b = 0;
		System.out.println("----------Input----------- [" + a + ", " + b + "]");
		output = p.predict(new double[] {a, b});
		System.out.println("----------Output----------- " + output + "\n");
	}
}
