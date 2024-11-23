package sorting;
/*
 * Quick select is very similar to Quick-Sort in place of sorting the whole array we just ignore the
one-half of the array at each step of Quick-Sort and just focus on the region of array on which we
are interested.

Avg=best time comp =O(logn)
space compl=O(n^2)
worst time comp=O(logn)

 */
public class sorting_8_QuickSelect {

	public static void main(String[] args) {
		int[] array={3,4,2,1,6,5,7,8,10,9};
		QuickSelect.quickSelect(array, 5);
		System.out.print("value at index 5 is : "+ array[4]);
		}

}
