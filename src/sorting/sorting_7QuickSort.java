package sorting;
/*
 * Quick sort is also a recursive algorithm.
· In each step we select a pivot ( let us say first element of array).
· Then we traverse the rest of the array and copy all the elements of the array which are
smaller than the pivot to the left side of array
· We copy all the elements of the array which are grater then pivot to the right side of the array.
Obviously the pivot is at its sorted position.
· Then we sort the left and right subarray separately.
· When the algorithm returns the whole array is sorted.

The space required by Quick-Sort is very less, only O(nlogn) additional space is required.

· Quicksort is not a stable sorting technique, so it might change the occurrence of two similar
elements in the list while sorting.
Complexity Analysis:

space  time - O(nlogn)
 */
public class sorting_7QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] array={3,4,2,1,6,5,7,8,1,1};
			QuickSort m = new QuickSort(array);
			m.sort();
			for(int i=0;i<array.length ;i++) {
			System.out.print(array[i] + " ");
			}
			
	}

}
