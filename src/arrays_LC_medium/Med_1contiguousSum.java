package arrays_LC_medium;

public class Med_1contiguousSum {

	//Maximum Subarray Sum – Kadane’s Algorithm
	//[Naive Approach] By iterating over all subarrays – O(n) Time and O(1) Space
	
	/*
	 *  Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
		Output: 11
		Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
		
		
		Input: arr[] = {-2, -4}
		Output: –2
		Explanation: The subarray {-2} has the largest sum -2.
		
		
		Input: arr[] = {5, 4, 1, 7, 8}
		Output: 25
		Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2, 3, -8, 7, -1, 2, 3};
		int n=arr.length;
		System.out.println("Max sub array sum :" + maxSubArraySum(arr,n));
		
	}

	public static int maxSubArraySum(int[] a, int size) {
		int maxSoFar = 0, maxEndingHere = 0;
		for (int i = 0; i < size; i++) {
			
			//start with 0 and add each element- maxEndingHere= sum 
			maxEndingHere = maxEndingHere + a[i];
			
			//if its negative
			if (maxEndingHere < 0)
			maxEndingHere = 0;
			
			//update maxSoFar if its less than maxEndingHere
			if (maxSoFar < maxEndingHere)
			maxSoFar = maxEndingHere;
		}
			return maxSoFar;
		}
	
	
	/*The idea of Kadane’s algorithm is to traverse over the array from left to right and for each element, 
	 * find the maximum sum among all subarrays ending at that element. The result will be the maximum of all these values. 


	But, the main issue is how to calculate maximum sum among all the 
	subarrays ending at an element in O(1) time?


	To calculate the maximum sum of subarray ending at current element, say maxEnding, we can use the maximum sum ending 
	at the previous element. So for any element, we have two choices:


	Choice 1: Extend the maximum sum subarray ending at the previous element by adding the 
	current element to it. If the maximum subarray sum ending at the previous index is positive, 
	then it is always better to extend the subarray.
	
	Choice 2: Start a new subarray starting from the current element. If the maximum subarray sum ending at the 
	previous index is negative, it is always better to start a new subarray from the current element.
	This means that maxEnding at index i = max(maxEnding at index (i – 1) + arr[i], arr[i]) and the maximum value of 
	maxEnding at any index will be our answer. 
		 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
