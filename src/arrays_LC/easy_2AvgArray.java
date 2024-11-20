package arrays_LC;

// find mean of elements of an array
public class easy_2AvgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6,7,8,11,88};
		System.out.println("mean of array:"  +CalculateMeanArr(arr));
		
	}

	private static float CalculateMeanArr(int[] arr) {
		// TODO Auto-generated method stub
		
		//int[] arr1= new arr1[n]
		int n= arr.length;
		int total=0;
		int mean;
		for (int i=0;i<n;i++) {
			total=total+arr[i];
		}
		mean=total/n;
		
		return mean;
	}

}
