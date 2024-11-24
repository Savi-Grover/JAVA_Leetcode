package priorityQueues;
/*
 * Enqueue / Insert
1. Add the new element at the end of the array. This keeps the structure as a complete binary
tree, but it might no longer be a heap since the new element might have a value greater than
its parent.
2. Swap the new element with its parent until it has value greater than its parents.
3. Step 2 will terminate when the new element reaches the root or when the new element's
parent have a value greater than or equal to the new element's value.
 */
/*
 

public class insertion_3 {
	
	
	public void add( int value )
	{
	if(size == arr.length - 1)
	doubleSize();
	arr[++size]=value;
	percolateUp(size);
	}
	private void doubleSize()
	{
	int[] old = arr;
	arr = new int[arr.length * 2];
	System.arraycopy(old, 1, arr, 1, size);
	}

}

 */