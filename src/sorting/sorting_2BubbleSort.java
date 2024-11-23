package sorting;
/*Bubble-Sort is the slowest algorithm for sorting, but it is heavily used, as it is easy to implement.
 * 
In Bubble-Sort, we compare each pair of adjacent values. We want to sort values in increasing
order so if the second value is less than the first value then we swap these two values. Otherwise,
we will go to the next pair.

Thus, smaller values bubble to the start of the array.
We will have N number of passes to get the array completely sorted.
After the first pass, the largest value will be in the rightmost position.
 * 
 * 
 * 
 */
public class sorting_2BubbleSort {
	private int[] arr;
	
	public void BubbleSort(int[] array)
	{
	int[] arr = {5,6,7,23,4};
	}
	
	//less function 
	private boolean less(int value1, int value2)
		{
		return value1 < value2;
		}
	//more function
	private static boolean more(int value1, int value2)
		{
		return value1 > value2;
		}
	
	public static void sort(int[] arr)
	{
	int size = arr.length;
	int i, j, temp = 0;
	
	//The outer for loops represents the number of swaps that are done for comparison of data.

		for (i = 0 ; i < ( size - 1 ); i++)
		{
			//The inner loop is actually used to do the comparison of data. At the end of each inner loop
			//iteration, the largest value is moved to the end of the array. In the first iteration the largest
			//value, in the second iteration the second largest and so on
			for (j = 0 ; j < size - i - 1; j++)
			{
					if (more(arr[j], arr[j+1]))
					{
					/* Swapping */
					temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
					}
			}
		}
		//return temp;
	}

	public static void main(String[] args) {
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
	
	/*
	 * Complexity Analysis:
Each time the inner loop execute for (n-1), (n-2), (n-3)…
(n-1) + (n-2) + (n-3) + ..... + 3 + 2 + 1 = n(n-1)/2

	 */

