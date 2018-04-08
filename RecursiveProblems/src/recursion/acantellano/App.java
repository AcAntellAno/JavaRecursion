package recursion.acantellano;

public class App {

	public static void main(String[] args) {
		Algorithm algorithm = new Algorithm();
		System.out.println(algorithm.sumIterative(5));
		
		Algorithm recAlg = new Algorithm();
		System.out.println(recAlg.sumRecursive(5));
		

		Algorithm buildingAlg = new Algorithm();
		buildingAlg.buildLayerHead(4);
		
		buildingAlg.buildLayerTail(4);
		
		Algorithm factorial = new Algorithm();
		
		System.out.println(factorial.factorial(4));
		
		Algorithm betterFactorial = new Algorithm();
		System.out.println(betterFactorial.calculateFactorial(4));
		
		
	}

}
