package arrays_LC;

public class easy_IsArrayPalindrome {

	
	//reversing given interger array
	public static int[] RevAry( int arr[]) {
		
		
		int n= arr.length;
		
		for (int i=0; i<n/2 ; i++) {
			
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		
		return arr;
			
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= { 3,5,6, 5,3};
		
		boolean res= isPalindrom(arr);
		System.out.println(res);

	}
	
	static boolean isPalindrom(int arr[]) {
		
		if(arr.equals(RevAry(arr))) {
			return true;
		}
		return false;
		
	}

}
