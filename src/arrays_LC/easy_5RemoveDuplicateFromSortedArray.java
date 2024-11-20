package arrays_LC;

import java.util.HashSet;

public class easy_5RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,1,1,2,3,4,4,5,7};
		//approache1-
		//int newSize=RemoveDuplicate(arr);
		//or
		int newSize=RemoveDuplicate1(arr);
		
		for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
	}

	private static int RemoveDuplicate(int[] arr) {
		//  fly TODO Auto-generated method stub
		
		int n=arr.length; 
		
		//if one elemenet in array
		if (n==1) {
			return arr[0];
		}
		
		// if 2 or more elements
		//start from second element; compare each element by previous element
		int index=1;
		for (int i =1; i<n; i++)
		{
			if(arr[i]!=arr[i-1]) {
				arr[index++]=arr[i];     //meaning= assign arr[idx] = arr[i] and increment idx
			} 
			
			
		}
		return index;
		 
	}
	
	 static int RemoveDuplicate1(int[] arr) {
	        
	        // To track seen elements
	        HashSet<Integer> s = new HashSet<>();
	        
	        // To maintain the new size of the array
	        int idx = 0;  

	        for (int i = 0; i < arr.length; i++) {
	            if (!s.contains(arr[i])) { 
	                s.add(arr[i]);  
	                arr[idx++] = arr[i];  
	            }
	        }

	        // Return the size of the array 
	        // with unique elements
	        return idx;
	    }

}

/*
 * Expected Approach – O(n) Time and O(1) Space
		Since the array is sorted, we do not need to maintain a hash set. 
		All occurrences of an element would be consecutive. So we mainly need to check if the 
		current element is same as the previous element or not. 


Step by step implementation:

-Start with idx = 1 (idx is going to hold the index of the next distinct item. Since there is nothing before 
the first item, we consider it as the first distinct item and begin idx with 1.
-Loop through the array for i = 0 to n-1.
-At each index i, if arr[i] is different from arr[i-1], assign arr[idx] = arr[i] and increment idx.
-After the loop, arr[] contains the unique elements in the first idx positions.
 */

/*  medium question- second approach - HashSet - Using Hash Set – Works for Unsorted Also – O(n) Time and O(n) Space
 * 
 *-Use a hash set or dictionary to store elements already processed
  -Initialize index of result array as 0.
  -Traverse through the input array. If an element is not in the hash set, 
   put it at the result index and insert into the set.
 * 
 * 
 * 
 * 
 * 
 * 
 */
		
		

