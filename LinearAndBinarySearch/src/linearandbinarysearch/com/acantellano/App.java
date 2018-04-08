package linearandbinarysearch.com.acantellano;

/*
 * Linear search in an unsorted array we have to iterate through the whole
 * array sequentially...checking every item => O(N) time 
 * 
 * Binary Search we can do better if the array is sorted
 * It finds the position of a target value within a sorted array
 * O(log N) time
 * 
 * How binary search works: we can start by comparing the target value to the value
 * of the middle element of the sorted array:
 * 			-if this element is greater than the item we are looking for:
 * 				we continue the search on the right subarray
 * 			-if the element is less => we search the left subarray
 * 
 * Why is it good? We can discard half of the items on every iteration
 * which would be logarithmic time complexity (if array is not sorted than we cannot
 * do better than linear search)
 * 
 * Interpolation Search: can use it if the array is sorted. 
 * It is like when we look through a telephone book
 * 		-we make a guess where in the item we are looking for might be
 * 		- in binary search we jump to the middle index...here this is not the case
 * 		- we just make a simple linear interpolation
 * This is O(log log N) comparisons 
 */

public class App {

	public static void main(String[] args) {
		int[] unsortedArray = {1, 5, 3, 8, 9, 10, -3};
		int[] sortedArray = {1, 3, 4, 7, 8, 9, 10};
		Algorithm algorithm = new Algorithm(unsortedArray);
		System.out.println(algorithm.linearSearch(10));
		
		Algorithm bAlgorithm = new Algorithm(sortedArray);
		System.out.println(bAlgorithm.binarySearch(8));
		
		

	}

}
