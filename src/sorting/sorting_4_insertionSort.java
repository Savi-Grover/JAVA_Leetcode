package sorting;
/*
 * Insertion-Sort Time Complexity is O( ) which is same as Bubble-Sort but perform a bit better
than it. It is the way we arrange our playing cards. We keep a sorted subarray. Each value is
inserted into its proper position in the sorted sub-array in the left of it.

 */
public class sorting_4_insertionSort {
	private int[] arr;
	
	public void InsertionSort(int[] array) 
		{
		arr = array;
		}
	
	private static boolean more(int value1, int value2)
		{
		return value1 > value2;
		}
	
	public static void sort(int[] arr)
	{
		int size = arr.length;
		int temp,j;
		
		//The outer loop is used to pick the value we want to insert into the sorted left array.

	for(int i=1; i<size; i++)
	{
		temp=arr[i];  //The value we want to insert we have picked and saved in a temp variable
		
		//The inner loop is doing the comparison using the more() function. The values are shifted to
		//the right until we find the proper position of the temp value for which we are doing this iteration
			for(j=i; j>0 && more(arr[j-1], temp); j--)
				{
				arr[j]=arr[j-1];          //In each iteration of the outer loop, the
				                          //length of the sorted array increase by one. When we exit the outer 
				                          //loop the whole array issorted.

				}
			
		arr[j]=temp;
	}
		
	}
	

	public static void main(String[] args) 
	{
		int[] array = {9,1,8,2,7,3,6,4,5};
		//InsertionSort bs = new InsertionSort(array);
		//bs.
		sort(array);
		for(int i=0;i<array.length ;i++)
		{
		System.out.print(array[i] + " ");
		}
		}

}

