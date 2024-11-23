package sorting;


/*
 * Merge sort divide the input into half recursive in each step. It sort the two parts separately
recursively and finally combine the result into final sorted output.

 * The Time Complexity of Merge-Sort is O(nlogn) in all 3 cases (best, average and worst) as
Merge-Sort always divides the array into two halves and take linear time to merge two halves.

· It requires the equal amount of additional space as the unsorted list. Hence, it is not at all
recommended for searching large unsorted lists.

· It is the best Sorting technique for sorting Linked Lists.

 * 
 * 
 */
public class sorting_6MergeSort {
	public static void main(String[] args) {
		int[] array={3,4,2,1,6,5,7,8,1,1};
		
		MergeSort m = new MergeSort(array);
		m.sort();
		
		for(int i=0;i<array.length ;i++)
			{
			System.out.print(array[i] + " ");
			}
		}

}