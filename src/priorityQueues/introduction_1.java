package priorityQueues;
/*
 * A Priority-Queue also knows as Binary-Heap, is a variant of queue. Items are removed from the
start of the queue. However, in a Priority-Queue the logical ordering of objects is determined by
their priority. The highest priority item are at the front of the Priority-Queue. 

When you add an item to Priority-Queue the new item can more to the front of the queue. A Priority-Queue is a very
important data structure. Priority-Queue is used in various Graph algorithms like Prim’s
Algorithm and Dijkstra’s algorithm. Priority-Queue is also used in the timer implementation etc.

A Priority-Queue is implemented using a Heap (Binary Heap). A Heap data structure is an array
of elements that can be observed as a complete binary tree. The tree is completely filled on all
levels except possibly the lowest. And heap satisfies the heap ordering property. A heap is a
complete binary tree so the height of tree with N nodes is always O(logn).

 * 
 * A heap is not a sorted data structure and can be regarded as partially ordered. As you see from
the picture, there is no relationship among nodes at any given level, even among the siblings.

Heap is implemented using an array. And because heap is a complete binary tree

Types of Heap
There are two types of heap and the type depends on the ordering of the elements. The ordering
can be done in two ways: Min-Heap and Max-Heap

Max Heap
Max-Heap: the value of each node is less than or equal to the value of its parent, with the largest 
value element at the root.
 * 
 * 
 * Min-Heap: the value of each node is greater than or equal to the value of its parent, with the
minimum-value element at the root.
 * 
 * complexity -
 * 
 * add/delete/deleteKelement= O(logn)
 * find =O910
 * 
 * 
 * Uses of Heap
1. Heapsort: One of the best sorting methods being in-place and log(N) time complexity in
all scenarios.

2. Selection algorithms: Finding the min, max, both the min and max, median, or even the kth
largest element can be done in linear time (often constant time) using heaps.

3. Priority Queues: Heap Implemented priority queues are used in Graph algorithms
like Prim’s Algorithm and Dijkstra’s algorithm. A heap is a useful data structure when you
need to remove the object with the highest (or lowest) priority. Schedulers, timers

4. Graph algorithms: By using heaps as internal traversal data structures, run time will be
reduced by polynomial order. Examples of such problems are Prim's minimal

5. Because of the lack of references, the operations are faster than a binary tree. Also, some
more complicated heaps (such as binomial) can be merged efficiently, which isn't easy to
do for a binary tree.
 * 
 */
public class introduction_1 {

}
