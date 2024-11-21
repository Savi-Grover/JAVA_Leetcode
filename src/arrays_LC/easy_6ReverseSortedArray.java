package arrays_LC;

//to reverse the sorted array- we will use temp variable &
//we will use two pointers  together in for loop- one for start index; one for end indiex
//start index will be incrementing
//end index will be decrementing

//Approach 1 = 2 pointers and yemp varible approach
//Time Complexity: O(n), as we are visiting each element exactly once.
//Auxiliary Space: O(1)

public class easy_6ReverseSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5,6,7};
		int n = arr.length;
		int start = 0;
		int end = n-1;
		//3 methods 
		//ReverseArray(arr,n,start,end);
		//ReverseArray2(arr);
		reverseArray3(arr);
		
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
		}

	}

	
	private static void ReverseArray(int[] arr, int n, int start, int end) {
		// TODO Auto-generated method stub
		
		for (int i=start,j=end; i<j; i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		//return arr[n];
	}

	
	//Approach 2 = Naive Approach - Using a temporary array – O(n) Time and O(n) Space ; more space- 
	//because you are taking another array of same size.
	
	
	private static void ReverseArray2(int[] arr) {
	        int n = arr.length;
	        
	        // Temporary array to store elements in reversed order
	        int[] temp = new int[n];
	  
	        // Copy elements from original array to temp in reverse order
	        for (int i = 0; i < n; i++)
	            temp[i] = arr[n - i - 1];
	  
	        // Copy elements back to original array
	        for (int i = 0; i < n; i++)
	            arr[i] = temp[i];
	    }
	
	//Approach 3 - Using Recursion – O(n) Time and O(n) Space
	
	private static void reverseArray3(int[] arr) {
        int n = arr.length;
        reverseArrayRec3(arr, 0, n - 1);
    }


	private static void reverseArrayRec3(int[] arr, int l, int r) {
        if (l >= r)
            return;
  
        // Swap the elements at the ends
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
  
        // Recur for the remaining array
        reverseArrayRec3(arr, l + 1, r - 1);
    }
}
