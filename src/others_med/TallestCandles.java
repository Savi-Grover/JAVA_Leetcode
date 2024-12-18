package others_med;

import java.util.Arrays;
import java.util.Scanner;

/*
 * You are in charge of the cake for a child's birthday. 
 * You have decided the cake will have one candle for each year of their total age. 
 * They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

Example input = {4,4,1,3}
output = 2  ( as 2 are maximum )


The maximum height candles are  units high. There are  of them, so return .
 */
public class TallestCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt(); //age=number of total candles
		int[] arr = new int [n];
		
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int number1= NumberOfTallestCandles(arr);
		System.out.println(number1);
		sc.close();
		

	}

	private static int NumberOfTallestCandles(int[] arr) {
		// TODO Auto-generated method stub
		
		int number=0;
		Arrays.sort(arr);
		int n= arr.length;
		int maxHeight= arr[n-1];
		
		for (int i=0 ; i <n ; i++) {
			if(arr[i]==maxHeight) {
				number++;
			}
			
			else if(n==1){
				number=1;
			}
		}
		
		return number;
	}

}
