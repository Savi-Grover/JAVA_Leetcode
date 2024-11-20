package arrays_LC;

public class easy_3SearchAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int k=11;
		
		//below are 2 diff search methods
		SearchInArray(arr,k);
		optimizeSearch(arr,k);

	}

	private static void SearchInArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n=arr.length; 
		for(int i=0; i<n; i++) {
			if (arr[i]==k) {
				System.out.println("element found at: " +i);
			}
			
			else {
				System.out.println("element not found");
			}
			
		}
	
	}
	
	private static int optimizeSearch(int[] arr, int k) {
		
		int n= arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				System.err.println("element found at: " +i);
				return i;
			}
		}
		return -1;
		// TODO Auto-generated method stub
		
	}

	
	/*
	 * Analysis:
			· Since we have no idea about the data stored in the array, or if the data is not sorted then 
			we have to search the array in sequential manner one by one.
			· If we find the value, we are looking for we return that index.
			· Else, we return -1 index, as we did not found the value we are looking for.
			
		In the above example, the data are not sorted. If the data is sorted, a binary search may be done.
		
		binary search= We examine the middle position at each step. Depending upon the data that we are searching is
		greater or smaller than the middle value. We will search either the left or the right portion of the
		array. At each step, we are eliminating half of the search space there by making this algorithm
		very efficient the linear search. so time complexity of binary search is less than sequential search but needs sorting.

	 */
}
