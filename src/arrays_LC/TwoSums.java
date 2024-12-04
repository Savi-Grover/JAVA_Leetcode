package arrays_LC;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 * 
 * 
 * 
 * 
 */
public class TwoSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,7,11,15};
		int target=9;
		
		//naive approach = o(n^2)
		//twoSum(nums,target);
		
		//better1 - sort+ find compliment+ check if compliment exist in bs subarray
		//boolean res= twoSum1(nums,target);
		//System.out.println(res);
		
		//best - hashset
		boolean res2= twoSum2(nums,target);
		System.out.println(res2);
		
	}
	
private static boolean twoSum2(int[] nums, int target) {
		// TODO Auto-generated method stub
	  // Create a HashSet to store the elements
    HashSet<Integer> set = new HashSet<>();

    // Iterate through each element in the array
    for (int i = 0; i < nums.length; i++) {

        // Calculate the complement that added to
        // arr[i], equals the target
        int complement = target - nums[i];

        // Check if the complement exists in the set
        if (set.contains(complement)) {
            return true;
        }

        // Add the current element to the set
        set.add(nums[i]);
    }
    // If no pair is found
    return false;
	}

private static boolean twoSum1(int[] nums, int target) {
		//sort is inclass method
		Arrays.sort(nums);
		
		// Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Use binary search to find the complement
            if (binarySearch(nums, i + 1, nums.length - 1,complement)) {
            	return true;
            }
                
        }
        // If no pair is found
        return false;
		
		
		
	}

private static boolean binarySearch(int[] nums, int left, int right, int target) {
	// TODO Auto-generated method stub
	 while (left <= right) {
         int mid = left + (right - left) / 2;

         if (nums[mid] == target)
             return true;
         if (nums[mid] < target)
             left = mid + 1;
         else
             right = mid - 1;
     }
     return false;
}



public static int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                	System.out.println("sum found");
                    return new int[] {i, j};
                }
            }
            
        }
       return new int[] {};
       
    }

}
