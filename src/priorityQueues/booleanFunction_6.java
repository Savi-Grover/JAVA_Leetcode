package priorityQueues;

public class booleanFunction_6 {

	// Given an array, find if it is a binary Heap is Min Heap
	static boolean IsMinHeap(int[] arr, int size)
	{
		for (int i = 0; i <= (size - 2) / 2; i++)
			{
			if (2 * i + 1 < size)
				{
				if (arr[i] > arr[2 * i + 1])
				return false;
				}
			if (2 * i + 2<size)
				{
				if (arr[i] > arr[2 * i + 2])
				return false;
				}
			}
		return true;
	}
	
	//Is Max Heap
	//Given an array find if it is a binary Heap Max heap
	static boolean IsMaxHeap(int[] arr, int size)
	{
		for (int i = 0; i <= (size - 2) / 2; i++)
			{
			if (2 * i + 1 < size && arr[i] < arr[2 * i + 1])
			return false;
			if (2 * i + 2 < size && arr[i] < arr[2 * i + 2])
			return false;
			}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9,8,7,5,1,6,3,2,4 };
		boolean res=IsMinHeap(arr,9);
		System.out.println(res);
		boolean res1=IsMaxHeap(arr,9);
		System.out.println(res1);
	}
/*
 * Analysis: If each parent is grater then its children then heap property is true. We will start from
half of the array and will reduce the size one by one thereby comparing the value of index node
with its left child and right child node.
 */
}
