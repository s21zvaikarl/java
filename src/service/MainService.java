package service;
import java.util.Arrays;
import java.util.Random;
import java.util.random.*;

public class MainService {

	public static void main(String[] args) {
		
		System.out.println("Sveiki JAVA");
		
		//ex 0
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
				"Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron",
				"Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,
				299, 343, 317, 265 };

		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " " + times[i] + " sec");
		}
		
		for (String temp : names) {
			System.out.println(temp);
		}
		
		//ex 1
		positionCalc();
		
		//ex 2
		System.out.println(factorialLoop(3));
		System.out.println(factorialRecursive(3));
		
		//ex 3
		System.out.println(Arrays.toString(generateArray(5, 1.3, 5.8)));
		System.out.println(getMean(generateArray(5, 1.3, 5.8)));
		
	}



	//ex 1
	public static void positionCalc() {
		double gravity = -9.81; // Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		
		finalPosition = 0.5*gravity*Math.pow(fallingTime, 2) + initialVelocity*fallingTime + initialPosition;
		System.out.println("Pos in "+fallingTime+"sec :"+finalPosition);
	}
	
	//ex 2
	public static int factorialLoop(int N) {
		if (N > 0) {
			int result = 1;
			for(int i=1; i<=N; i++) {
				result *= i;
			}
			return result;
		}
			return 0;
	}
	
	public static int factorialRecursive(int N) {
		if (N>0) {
			return N*factorialRecursive(N-1);
		}
		return 0;
	}
	
	
	public static double[] generateArray(int N, double lower, double upper) {
		if(N>0) {
			double[] result = new double[N];
			if(lower <= upper) {
				Random rand = new Random();
				
				for(int i=0; i<result.length; i++) {
					double temp = rand.nextDouble()*(upper-lower) + lower;
					result[i] = temp;
				}
				return result;
			}
		}
		return (new double[0]);
		
	}
	
	public static double getMean(double[] array) {
		if(array!=null) {
			double mean = 0;
			for(double temp : array) {
				mean += temp;
			}
			return mean/array.length;
		}
		return 0;
	}
	
	public static double getMin(double[] array) {
		if(array!=null) {
			double min = Double.MAX_VALUE;
			for(double temp: array) {
				if(temp < min) {
					min = temp;
				}
				
			}
			return min;
		}
		return 0;
	}
	
	//ex 4
	public static double[][] generateMatrix(int N){
		if(N>0) {
			double[][] result = new double[N][N];
			Random rand = new Random();
			for(int i=0; i<result[i].length; i++) {
				for(int j=0; j<result[j].length; j++) {
					double temp = rand.nextDouble();
					result[i][j] = temp;
				}
			}
			return result;
		}
		return (new double[0][0]);
	}
}

