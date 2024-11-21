package collections;
/*
 * JAVA programming language provides a JAVA Collection Framework, which is a set of high
quality, high performance & reusable data-structures and algorithms.


collections are mainly of 3 type = 
	List, 
	Set, 
	Queue ( all are interfaces)

List can be of 2 types  - ArrayList (cl),LinkedList(cl)( internally implements List)

	Set are of 4 types - 
	SortedSet(intf), 
	TreeSet ( cl), 
	HashSet ( cl), 
	LinkedHashset ( cl)

Queue are of 2 types - 
	priority queue (cl) ; --> implemented by 3 main type - map (int), treemap(cl), hashmap(cl)
	Dequeu (int)--> implementes in ArrayDeque


The following advantages of using a JAVA collection framework:
	1. Programmers do not have to implement basic data structures and algorithms again and
	again. Thereby it prevents the reinvention the wheel. Thus the programmer can devote more
	effort in business logic.
	
	2. The JAVA Collection Framework code is well-tested, high quality, high performance code
	there by increasing the quality of the programs.
	
	3. Development cost is reduced as basic data structures and algorithms are implemented in
	Collections framework.
	
	4. Easy for the review and understanding others programs as other developers also use the
	Collection framework. In addition, collection framework is well documented.
 */
public class Introduction {

	//arrays
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++)
		{
		arr[i] = i;
		}
		}


	
	//ArrayList - were developed to overcome disadvantage of Arrays
	/*
	Arrays-
	Array represents a collection of multiple elements of the same datatype. Arrays are fixed size
	data structure, the size of this data structure is fixed at the time of its creation. Arrays are the most
	common data structure used to store data.
	As we cannot change the size of an array, we generally declare a large size array to handle any
	future data expansion. This ends up in creating a large size array, where most of the space is
	unused.
	Note: - Arrays can store a fixed number of elements, whereas a collection stores object
	dynamically so there is no size restrictions it grows and shrinks automatically.
	
	
	Below is the API of array:
	1. Adds an element at kth position
	Value can be stored in array at Kth position in O(1) constant time. We just need to store
	value at arr[k].
	2. Reading the value stored at kth position.
	Accessing value stored a some location in array is also O(1) constant time. We just need to
	read value stored at arr[k].
	
	JAVA standard arrays are of fixed length. Sometime we do not know how much memory we need
	so we create a bigger size array. There by wasting space to avoid this situation JAVA Collection
	framework had implemented ArrayList to solve this problem.



*/
	
}
