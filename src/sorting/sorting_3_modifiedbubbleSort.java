package sorting;
/*
 * 
 * Modified (improved) Bubble-Sort
 * 
When there is no more swap in one pass of the outer loop. 

It indicates that all some elements are
already in order so we should stop sorting. This sorting improvement in Bubble-Sort is extremely
useful when we know that, except few elements rest of the array is already sorted.
 * 
 * 
 */
public class sorting_3_modifiedbubbleSort {
	
	private int[] arr;
	
	//more function
		private static boolean more(int value1, int value2)
			{
			return value1 > value2;
			}
		
		
	public void sort()
	{
		int size = arr.length;
		int i, j, temp, swapped=1;
		for (i = 0; i < (size - 1) && swapped == 1; i++)
		{
			swapped = 0;
				for (j = 0; j < size - i - 1; j++)
				{
							if (more(arr[j], arr[j + 1]))
							{
							/* Swapping */
							temp = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1] = temp;
							swapped = 1;
							}
				}
		}
	}
}


/*
By applying this improvement, best case of this algorithm, when an array is nearly sorted, is
improved.

Best case is O(n)
*/