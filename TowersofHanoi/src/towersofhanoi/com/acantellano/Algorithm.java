package towersofhanoi.com.acantellano;

public class Algorithm {
	public void solveHanoi(int n, char rodFrom, char middleRod, char rodTo){
		//base case
		if(n == 1){
			System.out.println("Plate 1 from " +rodFrom+ " to " +rodTo); //move to last rod
			return; 
		}
		//n - 1 because last one remains on rodFrom
		solveHanoi(n - 1, rodFrom, rodTo, middleRod); //shift n-1 items to middleRod
		System.out.println("Plate " +n+ " from " +rodFrom+ " to " +rodTo);
		//could use starting rod now as a "auxiliary" rod
		solveHanoi(n - 1, middleRod, rodFrom, rodTo);
		
	}

}
