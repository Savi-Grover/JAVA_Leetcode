package sorting;
/*
 * Exercise
1. Given a text file, print the words with their frequency. Now print the kth word in term of
frequency.
Hint:
a. First approach may be you can use the sorting and return the kth element.
b. Second approach: You can use the kth element quick select algorithm.
c. Third approach You can use Hashtable or Trie to keep track of the frequency. Use Heap
to get the Kth element.

2. Given K input streams of number in sorted order. You need to make a single output stream,
which contains all the elements of the K streams in sorted order. The input streams support
ReadNumber() operation and output stream support WriteNumber() operation.
Hint:
a. Read the first number from all the K input streams and add them to a Priority Queue.
(Nodes should keep track of the input stream)
b. Dequeue one element at a time from PQ, Put this element value to the output stream,
Read the input stream number and from the same input stream add another element to
PQ.
c. If the stream is empty, just continue
d. Repeat till PQ is empty.

3. Given K sorted arrays of fixed length M. Also, given a final output array of length M*K.
Give an efficient algorithm to merge all the arrays into the final array, without using any extra
space.
Hint: you can use the end of the final array to make PQ.

4. How will you sort 1 PB numbers? 1 PB = 1000 TB.

5. What will be the complexity of the above solution?

6. Any other improvement on question 3 solution if the number of cores is eight.

7. Given an integer array that support three function findMin, findMax, findMedian. Sort the
array.

8. Given a pile of patient files of High, mid and low priority. Sort these files such that higher
priority comes first, then mid and last low priority.
Hint: Bucket sort.

9. Write pros and cons of Heap-Sort, Merge-Sort and Quick-Sort.

10. Given a rotated - sorted array of N integer s. (The array was sorted then it was rotated
some arbitrary number of times.) If all the elements in the array were unique the find the
index of some value.
Hint: Modified binary search

11. In the problem 9, what if there are repetitions allowed and you need to find the index of the
first occurrence of the element in the rotated-sorted array.

12. Merge two sorted arrays into a single sorted array.
Hint: Use merge method of Merge-Sort.

13. Given an array contain 0’s and 1’s, sort the array such that all the 0’s come before 1’s.

14. Given an array of English characters, sort the array in linear time.

15. Write a method to sort an array of strings so that all the anagrams are next to each other.
Hint:
a. Loop through the array
b. For each word, sort the characters and add it to the hash map with keys as sorted word
and value as the original word. At the end of the loop, you will get all anagrams as the
value to a key (which is sorted by its constituent chars).
c. Iterate over the hashmap, print all values of a key together and then move to the next
key.
Space Complexity: O(n), Time Complexity: O(n)
 */
public class sorting_9_1_Exercises {

}
