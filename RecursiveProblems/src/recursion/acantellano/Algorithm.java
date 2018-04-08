package recursion.acantellano;

public class Algorithm {
	public int sumIterative(int n){
		int result = 0;
		for(int i = 0; i <= n; ++i){
			result = result + i;
		}
		return result;
	}
	
	public int sumRecursive(int n){
		if( n == 1) return 1;
		return n + sumRecursive(n - 1);
	}
	
	public void buildLayerHead (int height){ //head recursion
		if(height == 0) return;
		//uses stack memory
		buildLayerHead(height - 1);
		System.out.println(height);
	}
	
	public void buildLayerTail (int height){ //tail recursion
		if(height == 0) return;
		
		System.out.println(height);
		buildLayerTail(height - 1);
	}
	
	public int factorial(int n){
		//4! = 4*3*2*1
		//n! = n*(n-1) * (n-2) * ...
		if(n == 1) return 1;
		
		return n * factorial(n - 1);
		
		//uses stack because we don't know what is factorial(3) or factorial(2) etc
		
	}
	
	//better approach because we only store a reference to an accumulator
	//so, since we did that we do not have to return variables on the stack

	//because we are going to return accumulator instead of 1 and no longer adding 
	//recursive calls to stack. This is a faster and more efficient solution
	//to the factorial problem. Same for fibonacci numbers, you wouldn't store
	//1000 fibonacci recursive calls on stack, instead you go to the accumulator
	//and return the solution
	public int factorialBetter(int accumulator, int n){ 
		if(n == 1) return accumulator;
		
		return factorialBetter(accumulator * n, n - 1);
		
	}
	
	public int calculateFactorial(int n){
		return factorialBetter(1, n);
	}
}
