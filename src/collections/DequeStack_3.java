package collections;

import java.util.ArrayDeque;

/*
 * STACK-
 * Stack is a special kind of data structure that follows Last-In-First-Out (LIFO) strategy. This means
	that the element that is added to stack last will be the first to be removed.
	The various applications of stack are:
		1. Recursion: recursive calls are preformed using system stack.
		2. Postfix evaluation of expression.
		3. Backtracking
		4. Depth-first search of trees and graphs.
		5. Converting a decimal number into a binary number etc.


Stack ADT Operations
	Push(k): Adds a new item to the top of the stack
	Pop(): Remove an element from the top of the stack and return its value.
	Top(): Returns the value of the element at the top of the stack
	Size(): Returns the number of elements in the stack
	IsEmpty(): determines whether the stack is empty. It returns 1 if the stack is empty or return 0.
Note: All the above Stack operations are implemented in O(1) Time Complexity.

Stack implementation in JAVA Collection
Stack is implemented by calling push and pop methods of ArrayDeque<T> class.
JDK also provides Stack<T>, but we should not use this class and prefer Deque which implement
collection interface.
	1. First reason is that Stack<T> does not drive from Collection interface.
	2. Second Stack<T> drives from Vector<T> so random access is possible so it brakes
	abstraction of a stack.
	3. Third ArrayDeque is more efficient as compared to Stack<T>.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class DequeStack_3<T> {
	private ArrayDeque<T> deque = new ArrayDeque<T>();
		public void push(T obj){           //- we will directly use ArrayDeque object. We will not be making
										//DequeStack wrapper class. When we use push() and pop() methods to 
										//insert and remove from a
			                            //ArrayDeque we will be doing stack operations.
			
		deque.push(obj);
		}
		
		public T pop(){
		return deque.pop();
		}
		
		public T top(){
		return deque.peekLast();
		}
		
		public int size(){
		return deque.size();
		}
		
		public boolean isEmpty(){
		return deque.isEmpty();
		}
		}
