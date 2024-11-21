package collections;

import java.util.ArrayDeque;

/*
 * A queue is a First-In-First-Out (FIFO) kind of data structure. The element that is added to the
queue first will be the first to be removed from the queue and so on.
Queue has the following application uses:
1. Access to shared resources (e.g., printer)
2. Multiprogramming
3. Message queue


Queue ADT Operations:
		Add(): Add a new element to the back of the queue.
		Remove(): remove an element from the front of the queue and return its value.
		Front(): return the value of the element at the front of the queue.
		Size(): returns the number of elements inside the queue.
		IsEmpty(): returns 1 if the queue is empty otherwise return 0
Note: All the above Queue operations are implemented in O(1) Time Complexity

Queue implementation in JAVA Collection
ArrayDeque<T> is the class implementation of doubly ended queue. If we use add(), remove()
and peekFirst() it will behave as a queue. ( And if we use push(), pop() and peekLast() it behave
as a stack.)
 */
public class DequeQueue_4<T> {                        //DequeQueue wrapper
	private ArrayDeque<T> deque = new ArrayDeque<T>();
		public void add(T obj){
		deque.add(obj);
		}
		public T remove(){
		return deque.remove();
		}
		public T peek(){
		return deque.peekFirst();
		}
		public int size(){
		return deque.size();
		}
		public boolean isEmpty(){
		return deque.isEmpty();
}
}