package sorting;
/*
 * 
 * Bucket sort is the simplest and most efficient type of sorting. Bucket sort has a strict requirement
of a predefined range of data.
Like, sort how many people are in which age group. We know that the age of people can vary
between 1 and 130.

 * Analysis:
· We have created a count array to store counts.
· count array elements are initialized to zero.
· Index corresponding to input array is incremented.
· Finally, the information stored in count array is saved in the array.



Worst,avg case performance =O(n+k)
Worst case Space Complexity = O(k)
Where k - is number of distinct elements.
n – is the total number of elements in array
 */
public class sorting_9_BucketSortDemo {

	public static void main(String[] args) {
		int[] array={23,24,22,21,26,25,27,28,21,21};
		BucketSort m = new BucketSort(array,20,30);
		m.sort();
		for(int i=0;i<array.length ;i++)
			{
			System.out.print(array[i] + " ");
			}
		}

}
