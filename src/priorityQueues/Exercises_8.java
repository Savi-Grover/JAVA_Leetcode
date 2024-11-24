package priorityQueues;
/*
 * 1. What is the worst-case runtime Complexity of finding the smallest item in a min-heap? 
 * 
 * ans - O(1)
 * 
2. Find max in a min heap.
Hint: normal search in the complete array. There is one more optimization you can search
from the mid of the array at index N/2

3. What is the worst-case time Complexity of finding the largest item in a min-heap?

4. What is the worst-case time Complexity of deleteMin in a min-heap? O(logn)

5. What is the worst-case time Complexity of building a heap by insertion?O(logn)

6. Is a heap full or complete binary tree?
ans- A heap is a complete binary tree; it is not a full binary tree. 

Explanation:
Complete binary tree:
A complete binary tree means all levels of the tree are fully filled except possibly the last level, 
which is filled from left to right. 

Full binary tree:
A full binary tree requires every node to have either zero or two children, meaning no node can have only one child. 
 * 
 * 7. What is the worst time runtime Complexity of sorting an array of N elements using heapsort? O(nlogn)
 * 
8. Given a sequence of numbers: 1, 2, 3, 4, 5, 6, 7, 8, 9

a. Draw a binary Min-heap by inserting the above numbers one by one
b. Also draw the tree that will be formed after calling Dequeue() on this heap

9. Given a sequence of numbers: 1, 2, 3, 4, 5, 6, 7, 8, 9
a. Draw a binary Max-heap by inserting the above numbers one by one
b. Also draw the tree that will be formed after calling Dequeue() on this heap

10. Given a sequence of numbers: 3, 9, 5, 4, 8, 1, 5, 2, 7, 6. Construct a Min-heap by calling
CreateHeap function.

11. Show an array that would be the result after the call to deleteMin() on this heap

12. Given an array: [3, 9, 5, 4, 8, 1, 5, 2, 7, 6]. Apply heapify over this to make a min heap and
sort the elements in decreasing order?

///////////////////////
13. In Heap-Sort once a root element has been put in its final position, how much time, does it
take to re-heapify the structure so that the next removal can take place? In other words, what is
the Time Complexity of a single element removal from the heap of size N?

ans-The time complexity of removing a single element from a heap of size N is O(log N).

Here's a breakdown of why:

Removal: In a heap, you typically remove the root element 
(the smallest in a min-heap or largest in a max-heap). 
This takes O(1) time as it's a simple access to the first element in the array representation.   

Replacement: You replace the root with the last element in the heap to maintain the 
complete binary tree property. This also takes O(1) time.

Heapify Down: Now, the heap property might be violated. You need to "heapify down" or 
"sift down" the new root element to its correct position. This involves repeatedly 
comparing the element with its children and swapping it with the smaller child (in a min-heap) until the 
heap property is restored.Since a heap is a binary tree, each level you go down in the heapify process 
roughly halves the number of nodes you need to consider. This gives you a logarithmic relationship with the total 
number of nodes (N). In the worst case, the element might need to travel down to the leaf level, which takes at most 
log N comparisons and swaps.   

Therefore, the dominant operation in removing an element from a heap is the "heapify down" process, which gives you a time complexity of O(log N).


14. What do you think the overall Time Complexity for heapsort is? Why do you feel this way?
 * 
 * 
 * 
 * 
 * 
 */
public class Exercises_8 {

}
