package practice_LC;


/*
 * Given the array of integers nums, you will choose two different indices i and j of that array. 
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 

Example 1:

Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
Example 2:

Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
Example 3:

Input: nums = [3,7]
Output: 12
 */
public class MaxProductOfConsecutiveIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {1,2,3,4,5,6};
     int res=MaxProduct(arr);
     System.out.println(res);
	}

	private static int MaxProduct(int[] arr) {
		// TODO Auto-generated method stub
		int n= arr.length-1;
		int res=0;
		//int MxProd=0;
		
		for (int i=0; i<n; i++) {
			for(int j =i+1 ; j<=n ; j++){
				//int prod =(arr[i]-1) * (arr[j+1]-1);
				 
				res=Math.max(res, (arr[i] - 1) * (arr[j] - 1));
				
			}
			
			
		}
		return res;
	}

}
