package priorityQueues;

/*
 * Problems in Heap
Kth Smallest in a Min Heap-
Just call DeleteMin() operation K-1 times and then again call DeleteMin() this last operation will
give Kth smallest value. Time Complexity O(KlogN)

Kth Largest in a Max Heap-
Just call DeleteMax() operation K-1 times and then again call DeleteMax () this last operation
will give Kth smallest value. Time Complexity O(KlogN)

100 Largest in a Stream-
There are billions of integers coming out of a stream some getInt() function is providing integers
one by one. How would you determine the largest 100 numbers?

Solution: Large hundred (or smallest hundred etc.) such problems are solved very easily using a
Heap. In our case, we will create a min heap.
1. First from 100 first integers builds a min heap.
2. Then for each coming integer compare if it is greater than the top of the min heap.
3. If not, then look for next integer. If yes, then remove the top min value from the min heap,
insert the new value at the top of the heap, use procolateDown, and move it to its proper
position down the heap.
4. Every time you have largest 100 values stored in your head

Merge two Heap
How can we merge two heaps?
Solution: There is no single solution for this. Let us suppose the size of the bigger heap is N and
the size of the smaller heap is M.
1. If both heaps are comparable size, then put both heap arrays in same bigger arrays. Or in one
of the arrays if they are big enough. Then apply CreateHeap() function which will take
theta(N+M) time.
2. If M is much smaller then N then add() each element of M array one by one to N heap. This
will take O(MlogN) the worst case or O(M) best case.

Get Median function
Example 11.6: Give a data structure that will provide median of given values in constant time.
Solution: We will be using two heap one min heap and other max heap. First, there will be a max
heap which will contain the first half of data and there will be an min heap which will contain the
second half of the data. Max heap will contain the smaller half of the data and its max value that is
at the top of the heap will be the median contender. Similarly, the Min heap will contain the larger
values of the data and its min value that is at its top will contain the median contender. We will
keep track of the size of heaps. Whenever we insert a value to heap, we will make sure that the
size of two heaps differs by max one element, otherwise we will pop one element from one and
insert into another to keep them balanced.
 */
public class ProblemSolving_5 {

}
