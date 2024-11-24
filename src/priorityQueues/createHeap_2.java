package priorityQueues;
/*
 * 
 * 1. Starts by putting the elements to an array.arrange in normal tree form.
 * 
 * percolate up or down: example lets create max heap
 * 
 => Starting from the middle of the array move downward towards the start of the array. At
each step, compare parent value with its left child and right child. And restore the heap
property by shifting the parent value with its greatest-value child. Such that the parent value
will always be greater than or equal to left child and right child.

in other words - in tree got from step 1 - start by comparing last leaf node to its parent; if  leaf >root then, exchange both.
2. do same step for second last leaf , if parent is already max, do nothing,

3.. percolate up and check leveln-1 of original tree and similarly reach to root.

4. finally you will arrange maximum element at root.

 

 */

/*
public class createHeap_2 {

	
	private void percolateDown(int position) {
		int lChild=2*position;
		int rChild=lChild+1;
		int small=-1;
		int temp;
		if( lChild <= size )
		small =lChild;
		if( rChild <= size && (arr[rChild] - arr[lChild])<0 )
		small =rChild;
		if( small!=-1 && (arr[small] - arr[position])<0 ) {
		temp=arr[position];
		arr[position]=arr[small];
		arr[small]=temp;
		percolateDown(small);
		}
		
		private void percolateUp( int position ) {
			int parent=position/2;
			int temp;
			if(parent==0)
			return;
			if((arr[parent] - arr[position])<0) {
			temp = arr[position];
			arr[position]=arr[parent];
			arr[parent] = temp;
			percolateUp(parent);
			}
		
}

*/
