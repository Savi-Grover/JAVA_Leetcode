package arrays_LC;

public class easy_4BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int value=11;
		int size= arr.length;
		int res=BinarySearch(arr,value, size);
		if (res==-1) {
		System.out.println("element not found");
		}
		else 
		System.out.println("element found  at " +res);

	}

	public static int BinarySearch (int arr[],int value,int size)
	{
	int mid;
	int low = 0;
	int high = size-1;
	//System.out.println(arr.length);
	while (low <= high)
		{
		mid = (low +high)/2; // To avoid the overflow
			if (arr[mid] == value) {
			return mid;
			}
			else if (arr[mid] < value) {
			low = mid + 1;
			}
			else
			high = mid - 1;
		}
	return -1;
	}

	}


/*
 * Analysis:
		· Since we have data sorted in increasing / decreasing order, we can apply more efficient
		binary search. At each step, we reduce our search space by half.
		· At each step, we compare the middle value with the value we are searching for. If mid
		value is equal to the value we are searching for then we return the middle index.
		· If the value is smaller than the middle value, we search the left half of the array.
		· If the value is grater then the middle value then we search the right half of the array.
		· If we find the value we are looking for then its index is returned or -1 is returned
		otherwise.
 */
