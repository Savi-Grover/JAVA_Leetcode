package sorting;
/*
 * Selection-Sort searches the whole unsorted array and put the largest value at the end of it. This
algorithm is having the same Time Complexity, but performs better than both bubble and
Insertion-Sort as less number of comparisons required. The sorted array is created backward in
Selection-Sort.

 */
public class sorting_5_SelectionSort {

	
	private static int[] arr;
	
	public static void SelectionSort(int[] array) 
		{
		arr = array;
		}
	//back array
	public static void sort(int[] arr) 
	{
		int size = arr.length;
		int i, j, max, temp;
		//The outer loop decide the number of times the inner loop will iterate. For a input of N
		//elements the inner loop will iterate N number of times.
		for (i = 0; i < size - 1; i++) {
			max = 0;
			//In each iteration of the inner loop the largest value is calculated and is placed placed at
			//the end of the array.
				for (j = 1; j < size -1 - i ; j++) {
					if (arr[j] > arr[max]) {
					max = j;
					}
				}
				
				//This is the final replacement of the maximum value to the proper location. The sorted
				//array is created backward.
			temp = arr[size - 1 - i];
			arr[size - 1 - i] = arr[max];
			arr[max] = temp;
			}
	}
	public static void main(String[] args) {
		int[] array = {9,1,8,2,7,3,6,4,5};
		//selection sort
		sort(array);
		for(int i=0;i<array.length ;i++)
		{
		System.out.print(array[i] + " ");
		}
		}
	}

/*

Complexity Analysis:
Worst Case Time Complexity O(n^2)

Best Case Time Complexity O(n^2)

Average case Time Complexity O(n^2)

Space Complexity O(1):


The same algorithm can be implemented by creating the sorted array in the front of the array.

//front array varient
void sort2() 
{
	int size = arr.length;
	int i, j, min, temp;
		for (i = 0; i < size - 1; i++) 
		{
			min = i;
			for (j = i + 1; j < size; j++) 
				{
				if (arr[j] < arr[min]) 
					{
					min = j;
					}
				}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
}



*/