package linearandbinarysearch.com.acantellano;

public class Algorithm {
	private int[] array;
	
	//constructor to get instance of array
	public Algorithm(int [] array){
		this.array = array;
		
	}
	
	public int linearSearch(int item){
		for(int i = 0; i < array.length; ++i){
			if(array[i] == item) return i;
			
		}
		return -1; //item not present in array
	}
	
	public int binarySearch(int item){
		return binarySearch(0, array.length - 1, item);
	}
	
	private int binarySearch(int startIndex, int endIndex, int item){
		if(endIndex < startIndex) {
			System.out.println("Item not present in array");
			return -1;
		}
		int middleIndex = (startIndex + endIndex) /2;
		
		if(item == array[middleIndex]){
			return middleIndex;
		} else if(item < array[middleIndex]){
			//-1 because we don't have to check middle index again
			return binarySearch(startIndex, middleIndex - 1, item); 
		} else {
			 //+1 because we don't have to check middle index again
			return binarySearch(middleIndex + 1, endIndex, item);
		}
	}

}
