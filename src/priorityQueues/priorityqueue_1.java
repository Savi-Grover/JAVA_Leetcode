package priorityQueues;
/*
 * A PriorityQueue is used when the objects are supposed to be processed based on the priority. It is known that a Queue follows 
 * the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the 
 * priority, that’s when the PriorityQueue comes into play.

The PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according to the 
natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.  

public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable

where E is the type of elements held in this queue

The class implements Serializable, Iterable<E>, Collection<E>, Queue<E> interfaces.
 * 
 */
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityqueue_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); //min-heap
		
		int[] arr = {1,2,10,8,7,3,4,6,5,9};
			for(int i: arr){
			pq.add(i);
			}
		System.out.println("Printing Priority Queue Heap : " + pq);
		System.out.print("remove elements of Priority Queue ::");
		while(pq.isEmpty() == false){
		System.out.print(" " + pq.remove());
	}
	}
	/*
	A few important points on Priority Queue are as follows: 

		-PriorityQueue doesn’t permit null.
		-We can’t create a PriorityQueue of Objects that are non-comparable
		-PriorityQueue are unbound queues.
		-The head of this queue is the least element with respect to the specified ordering. 
		-If multiple elements are tied for the least value, the head is one of those elements — ties are broken arbitrarily.
		-Since PriorityQueue is not thread-safe, java provides PriorityBlockingQueue class that implements the 
		BlockingQueue interface to use in a java multithreading environment.
		-The queue retrieval operations poll,  remove,  peek, and element access the element at the head of the queue.
		-It provides O(log(n)) time for add and poll methods.
		-It inherits methods from AbstractQueue, AbstractCollection, Collection, and Object class.
		
		
		Priority Queue is a data structure in which elements are ordered by priority, 
		with the highest-priority elements appearing at the front of the queue. Here are some 
		real-world examples of where priority queues can be used:

-Task Scheduling: In operating systems, priority queues are used to schedule tasks based on their priority levels. 
For example, a high-priority task like a critical system update may be scheduled ahead of a lower-priority task like a 
background backup process.

-Emergency Room: In a hospital emergency room, patients are triaged based on the severity of their condition, 
with those in critical condition being treated first. A priority queue can be used to manage the order in which 
patients are seen by doctors and nurses.

-Network Routing: In computer networks, priority queues are used to manage the flow of data packets. High-priority packets 
like voice and video data may be given priority over lower-priority data like email and file transfers.

-Transportation: In traffic management systems, priority queues can be used to manage traffic flow. For example, 
emergency vehicles like ambulances may be given priority over other vehicles to ensure that they can reach their 
destination quickly.

-Job Scheduling: In job scheduling systems, priority queues can be used to manage the order in which jobs are executed. 
High-priority jobs like critical system updates may be scheduled ahead of lower-priority jobs like data backups.

-Online Marketplaces: In online marketplaces, priority queues can be used to manage the delivery of products to customers. 
High-priority orders like express shipping may be given priority over standard shipping orders.
		*/
}

