package collections;

import java.util.LinkedList;

/*
 * Linked lists are dynamic data structure and memory is allocated at run time. The concept of linked
list is not to store data contiguously. Use links that point to the next elements.
Performance wise linked lists are slower than arrays because there is no direct access to linked
list elements.
The linked list is a useful data structure when we do not know the number of elements to be stored
ahead of time.
There are many flavors of linked list that you will see: linear, circular, doubly, and doubly
circular.

LinkedList<E> in by JAVA Collections is a data structure which also implements List<E>
interface.


Linked List ADT Operations
Below is the API of Linked list.
	-Insert(k): adds k to the start of the list
	Insert an element at the start of the list. Just create a new element and move references. So that
	this new element becomes the new element of the list. This operation will take O(1) constant
	time.
	
	-Delete(): delete element at the start of the list
	Delete an element at the start of the list. We just need to move one reference. This operation will
	also take O(1) constant time.
	
	-PrintList(): display all the elements of the list.
	Start with the first element and then follow the references. This operation will take O(N) time.
	
	-Find(k): find the position of element with value k
	Start with the first element and follow the reference until we get the value we are looking for or
	reach the end of the list. This operation will take O(N) time.
	Note: binary search does not work on linked lists.
	
	-FindKth(k): find element at position k
	Start from the first element and follow the links until you reach the kth element. This operation
	will take O(N) time.
	
	-IsEmpty(): check if the number of elements in the list are zero.
	Just check the head reference of the list it should be Null. Which means list is empty. This
	operation will take O(1) time.

 */
public class LinkedListDemo_2 {

	public LinkedListDemo_2() {
	}
	
	public static void main(String[] args) {
	LinkedList<Integer> ll = new LinkedList<Integer>();
	ll.addFirst(8); // 8 is added to the list
	ll.addLast(9); // 9 is added to last of the list.
	ll.addFirst(7); // 7 is added to first of the list.
	ll.addLast(20); // 20 is added to last of the list
	ll.addFirst(2); // 2 is added to first of list.
	ll.addLast(22); // 22 is added to last of the list.
	
	System.out.println("Contents of Linked List: " + ll);
	ll.removeFirst();
	
	ll.removeLast();
	System.out.println("Contents of Linked List: " + ll);
	}

}
