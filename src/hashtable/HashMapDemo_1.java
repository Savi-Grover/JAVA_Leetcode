package hashtable;

import java.util.HashMap;
/*
 * Characteristics of Java HashMap:
A HashMap is a data structure that is used to store and retrieve values based on keys. 
Some of the key characteristics of a hashmap include:

Fast access time: HashMaps provide constant time access to elements, which means that retrieval and 
insertion of elements are very fast, usually O(1) time complexity.

Uses hashing function: HashMaps uses a hash function to map keys to indices in an array. This allows for a quick 
lookup of values based on keys.

Stores key-value pairs: Each element in a HashMap consists of a key-value pair. The key is used to look up the associated 
value.

Supports null keys and values: HashMaps allow for null values and keys. This means that a null key can be used to store a 
value, and a null value can be associated with a key.

Not ordered: HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved. 
However, LinkedHashMap is a variation of HashMap that preserves the insertion order.

Allows duplicates: HashMaps allow for duplicate values, but not duplicate keys. If a duplicate key is added, the previous 
value associated with the key is overwritten.

Thread-unsafe: HashMaps are not thread-safe, which means that if multiple threads access the same hashmap simultaneously, 
it can lead to data inconsistencies. If thread safety is required, ConcurrentHashMap can be used.

Capacity and load factor: HashMaps have a capacity, which is the number of elements that it can hold, and a load factor, 
which is the measure of how full the hashmap can be before it is resized.

-In Java, HashMap is part of the Java Collections Framework and is found in the java.util package. 
It provides the basic implementation of the Map interface in Java. HashMap stores data in (key, value) pairs. 
Each key is associated with a value, and you can access the value by using the corresponding key.

-Java HashMap is similar to HashTable, but it is unsynchronized.
-It allows to store the null keys as well, but there should be only one null key object and there can be any 
number of null values.

-Duplicate Elements not allowed in HashMap, if you try to insert the duplicate key in HashMap, it will replace the 
element of the corresponding key.
 
-HashMap uses keys in same way as Array uses index.
-HashMap allows for efficient key-based retrieval, insertion, and removal with average O(1) time complexity.
 */
public class HashMapDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a hash map.
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		// Put elements into the map
		hm.put("Mason", new Integer(55));
		hm.put("Jacob", new Integer(77));
		hm.put("William", new Integer(99));
		hm.put("Alexander", new Integer(80));
		hm.put("Michael", new Integer(50));
		hm.put("Emma", new Integer(65));
		hm.put("Olivia", new Integer(77));
		hm.put("Sophia", new Integer(88));
		hm.put("Emily", new Integer(99));
		hm.put("Isabella", new Integer(100));
		
		System.out.println("Total number of students in class :: " + hm.size());
		for(String key : hm.keySet()){
		System.out.println(key + " score marks :" + hm.get(key));
		}
		System.out.println("Emma score present::" + hm.containsKey("Emma"));
		System.out.println("John score present:: " + hm.containsKey("John"));

	}
	
	/*Hierarchy of HashMap in Java
	 * 
	 * 				map ( int)<---- abstract map ( class )<--hashmap( class )<--linkedhashmap( class ) 
	 * 
	 */

}
