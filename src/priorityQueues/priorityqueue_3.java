package priorityQueues;

import java.util.Iterator;
import java.util.PriorityQueue;


/*
 * Adding Elements: In order to add an element in a priority queue, we can use the add() method. 
 * The insertion order is not retained in the PriorityQueue.
 *  The elements are stored based on the priority order which is ascending by default. 
 */
public class priorityqueue_3 {
	
		public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<3;i++){
            pq.add(i);
            pq.add(1);
        }
        System.out.println(pq);
        
        
        //added in pq1 but printed does not show same order
        
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        
        pq1.add("Geeks");
        pq1.add("For");
        pq1.add("Geeks");
  
        System.out.println(pq1);
        
        // using remove the method
//In order to remove an element from a priority queue, we can use the remove() method. 
        //If there are multiple such objects, then the first occurrence of the object is removed. 
        //Apart from that, the poll() method is also used to remove the head and return it.
        //Time Complexity: O(log n)
        //Space Complexity: O(n)
        pq1.remove("Geeks");

        System.out.println("After Remove - " + pq1);

        System.out.println("Poll Method - " + pq1.poll());

        System.out.println("Final PriorityQueue - " + pq1);
        
        //accessing =peek
        // Using the peek() method-Since Queue follows the First In First Out principle, we can access only the head of the queue. 
        //To access elements from a priority queue, we can use the peek() method.
        //Time Complexity: O(1)
        //Space Complexity: O(n),
        String element = pq1.peek();
        System.out.println("Accessed Element: " + element);
        
        //iteration on pq- The most famous way is converting the queue to the array and traversing using the for loop. 
        //However, the queue also has an inbuilt iterator which can be used to iterate through the queue.
        //Time Complexity: O(n)
        //Space Complexity: O(1)
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("Geeks");
        pq2.add("For");
        pq2.add("Geeks");
        Iterator iterator = pq2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
            
          //// Remove all elements from the queue
            pq2.clear();
            System.out.println("After clear: " + pq2);
            
            
         // Check if the queue is empty
            System.out.println("Is the queue empty? " + pq2.isEmpty());
            
    }
	
}}


/*
 * Time and Space Complexities: add  ,delete
Time Complexity: O(log n)
Space Complexity: O(n), where n is the number of elements in the priority queue.
We will not get sorted elements by printing PriorityQueue.




 */
