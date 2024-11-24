package priorityQueues;

import java.util.PriorityQueue;

/*
 * Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 */
public class priorityqueue_4 {
	
	public static int findKthLargest(int[] nums, int k) {
        int n= nums.length;
       PriorityQueue<Integer> minHeap= new PriorityQueue<>(); // Mind Heap
       for(int i=0; i< n; i++){
           minHeap.add(nums[i]);
           if(minHeap.size() > k){ // Keeping the size K , so at the top kth largest element will be there
               minHeap.poll();
           }
       }
       return minHeap.peek();
   }
	 public static void main(String[] args) {
		 
		 int[] nums = {3,2,1,5,6,4}; 
		 int k = 2;
		// findKthLargest(nums,k);
		 //for(int i=0;i<n;i++) {
			 System.out.println("Max sub array sum :" + findKthLargest(nums,k));
			 //System.out.println(+nums[i]);
		 //}
}

   /*
   Initialize min-heap:
Create a min-heap to store elements.

Iterate through array:
Add each element to the min-heap.
If the heap size exceeds k, remove the smallest element using poll.

Return kth largest:
The top element of the min-heap is the kth largest element.

Time Complexity: O(n log k)
The min-heap operations (adding and removing elements) have a time complexity of O(log k).
Since the heap is maintained with a size of at most k, the overall time complexity is O(n log k).

Space Complexity: O(k)

The min-heap stores at most k elements, leading to O(k) space complexity.
   */

}
