package practice_LC;

import java.util.Arrays;

/*
 * Product of Array Except Self
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of 
 * all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.


Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

in= [0,0,9,8,7]
op=[0,0,0,0,0]
 */
public class ProductOfArrayExceptSelf {

	public static int[] ProductExceptSeft(int[] arr) {
		
		int n= arr.length;
		int c=0;
		int prod=1;
		int[] res = new int[n];
		Arrays.fill(res, 0);
		
		//count for 0s
		for (  int i : arr) {
			if ( i==0) {
				c++;
			}
			else 
				prod*=i;
		}
		
		
		//generate res array
		
		for ( int i =0 ; i <n ; i++) {
			if (c>1) {
				res[i]=0;
			}
			
			else if ( c==1) {
				if (arr[i]==0) {res[i]=prod;}
				else {
					res[i]=0;
				}
			}
			
			else {
				res[i]=prod/arr[i];
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,1,0,-3,3};
		int[] res= ProductExceptSeft(arr);
		for (int val : res) {
            System.out.print(val + " ");
        }
        System.out.println();
		
	}

}
