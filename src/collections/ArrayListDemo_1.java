package collections;

import java.util.ArrayList;

/*
 * 
 * ArrayList<E> in by JAVA Collections is a data structure which implements List<E> interface
which means that it can have duplicate elements in it. ArrayList is an implementation as dynamic
array that can grow or shrink as needed. (Internally array is used when it is full a bigger array is
allocated and the old array values are copied to it.)
 * 
 * 
 */
public class ArrayListDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array list is a class ; below is proper syntax to use ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//al - class intsance
		
		//add operations 
		al.add(1); // add 1 to the end of the list
		al.add(2); // add 2 to the end of the list
		al.add(3); // add 3 to the end of the list
		al.add(4); // add 4 to the end of the list
		System.out.println("Contents of Array: " + al); // array is converted to
		// string and printed to screen
		
		//add value at specific postion in list
		al.add(2,9); // 9 is added to 2
		al.add(5,9); // 9 is added to 5
		
		System.out.println("Contents of Array: " + al);
		System.out.println("Array Size: " + al.size()); // array size printed
		System.out.println("Array IsEmpty: " + al.isEmpty()); //isEmpty is a boolean function
		
		//delete from arrayList
		al.remove(al.size() -1); // last element of array is removed.
		System.out.println("Array Size: " + al.size());
		
		//remove all
		al.removeAll(al); // all the elements of array are removed.
		System.out.println("Array IsEmpty: " + al.isEmpty());
		
		//O(1) = complexity of each operation

	}

}
