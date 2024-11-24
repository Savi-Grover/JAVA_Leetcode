package priorityQueues;

import java.util.PriorityQueue;

public class priorityqueue_2 {
/*
 * Constructors:
1. PriorityQueue(): Creates a PriorityQueue with the default initial capacity (11) that orders its elements 
according to their natural ordering.

PriorityQueue<E> pq = new PriorityQueue<E>();


2. PriorityQueue(Collection<E> c): Creates a PriorityQueue containing the elements in the specified collection.

PriorityQueue<E> pq = new PriorityQueue<E>(Collection<E> c);


3. PriorityQueue(int initialCapacity): Creates a PriorityQueue with the specified initial 
capacity that orders its elements according to their natural ordering.

PriorityQueue<E> pq = new PriorityQueue<E>(int initialCapacity);


4. PriorityQueue(int initialCapacity, Comparator<E> comparator): 
Creates a PriorityQueue with the specified initial capacity that orders its elements according to the specified comparator.

PriorityQueue<E> pq = new PriorityQueue(int initialCapacity, Comparator<E> comparator);


5. PriorityQueue(PriorityQueue<E> c): Creates a PriorityQueue containing the elements in the specified priority queue.
PriorityQueue<E> pq = new PriorityQueue(PriorityQueue<E> c);


6. PriorityQueue(SortedSet<E> c): Creates a PriorityQueue containing the elements in the specified sorted set.
PriorityQueue<E> pq = new PriorityQueue<E>(SortedSet<E> c);


7. PriorityQueue(Comparator<E> comparator): Creates a PriorityQueue with the default initial capacity and whose 
elements are ordered according to the specified comparator.
PriorityQueue<E> pq = new PriorityQueue<E>(Comparator<E> c);


 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        //order of queue= 10,15,20
        //These lines add the numbers 10, 20, and 15 to the priority queue. 
        //The queue will maintain its min-heap property, so the elements will be ordered accordingly.

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());  //This line prints the top element of the queue, which is the smallest value (10 in this case).

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll()); //This line removes the top element (10) from the queue and prints it.

        // Printing the top element again
        System.out.println(pQueue.peek()); //This line prints the new top element after the removal. 
        									//Since 10 was removed, the next smallest element (15) will be at the top.
	}

	
	/*
	 * Example:

The example below explains the following basic operations of the priority queue.

-boolean add(E element): This method inserts the specified element into this priority queue.
-public peek(): This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
-public poll(): This method retrieves and removes the head of this queue, or returns null if this queue is empty.
	 * 
	 * 
	 */
}
