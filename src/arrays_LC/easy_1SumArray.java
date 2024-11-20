package arrays_LC;


//Write a method that will return the sum of all the elements of the integer array given array and its
//size as an argument.

public class easy_1SumArray {

	//int array declare
	//int[] arr= new int[10];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		System.out.println(arr.length);
		System.out.println("sum of array"  +SumArr(arr));
		
	}

	//method to evaluate sum
		public static int SumArr(int arr[]) {
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				sum = sum + arr[i];
				
				
			}
			return sum;
		}
}
