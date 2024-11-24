package priorityQueues;
/*
 * Traversal in Heap-
Heaps are not designed to traverse to find some element they are made to get min or max element
fast. Still if you want to traverse a heap just traverse the array sequentially. This traversal will be
level order traversal. This traversal will have linear Time Complexity.

Deleting Arbiter element from Min Heap-
Again, heap is not designed to delete an arbitrary element, but still if you want to do so. Find the
element by linear search in the heap array. Replace it with the value stored at the end of the Heap
value. Reduce the size of the heap by one. Compare the new inserted value with its parent. If its
value is smaller than the parent value, then percolate up. Else if its value is greater than its left
and right child then percolate down. Time Complexity is O(logn)

Deleting Kth element from Min Heap-
Again, heap is not designed to delete an arbitrary element, but still if you want to do so. Replace
the kth value with the value stored at the end of the Heap value. Reduce the size of the heap by
one. Compare the new inserted value with its parent. If its value is smaller than the parent value,
then percolate up. Else if its value is greater than its left and right child then percolate down.
Time Complexity is O(logn)

Print value in Range in Min Heap-
Linearly traverse through the heap and print the value that are in the given range
 */
public class drawback_7 {

}
