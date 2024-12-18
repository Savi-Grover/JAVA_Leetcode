package others_med;

import java.util.Arrays;
import java.util.*;
//import com.sun.java_cup.internal.runtime.Scanner;

public class MinMaxSum {
	public static void main(String[] args) {
		
		//when you are  not passing any hard coded test case in main but system will test it.
        Scanner scanner = new Scanner(System.in);
        
        // Read five integers into an array
        long[] arr = new long[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextLong();
        }
        
        // Call the function to calculate min and max sums
        calculateMinMaxSum(arr);
        
        scanner.close();
    }

    public static void calculateMinMaxSum(long[] arr) {
        Arrays.sort(arr); // Sort the array
        int n= arr.length;
        // Calculate the minimum sum (exclude the last element)
        long minSum = 0;
        long maxSum = 0;
        
        //method 1
        
//        for (int i = 0; i < 4; i++) {
//            minSum += arr[i];
//        }
//        
//        // Calculate the maximum sum (exclude the first element)
//        long maxSum = 0;
//        for (int i = 1; i < 5; i++) {
//            maxSum += arr[i];
//        }
        
        // method 2 
        
        long totalsum=0;
        for (int i=0 ; i <=5 ; i++) {
        	totalsum+=arr[i];
        }
        minSum=totalsum-arr[4];
        maxSum=totalsum-arr[0];
        
        // Print the results
        System.out.println(minSum + " " + maxSum);
    }
}

