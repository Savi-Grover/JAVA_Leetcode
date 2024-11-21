package collections;

import java.util.TreeSet;

/*
 * Tree is a hierarchical data structure. The top element of a tree is called the root of the tree. Except
the root element, every element in a tree has a parent element, and zero or more child elements.
The tree is the most useful data structure when you have hierarchical information to store.
There are many types of trees, for example, binary-tree, Red-black tree, AVLtree, etc.

Binary Tree
A binary tree is a type of tree in which each node has at most two children (0, 1 or 2) which are
referred as left child and right child.

Binary Search Trees (BST)

A binary search tree (BST) is a binary tree on which nodes are ordered in the following way:
1. The key in the left subtree is less than the key in its parent node.
2. The key in the right subtree is greater or equal the key in its parent node


Binary Search Tree ADT Operations
	Insert(k): Insert an element k into the tree.
	Delete(k): Delete an element k from the tree.
	Search(k): Search a particular value k into the tree if it is present or not.
	FindMax(): Find the maximum value stored in the tree.
	FindMin(): Find the minimum value stored in the tree.
-The average Time Complexity of all the above operations on a binary search tree is O(log n), the
case when the tree is balanced.
-The worst-case Time Complexity will be O(n) when the tree is skewed. A binary tree is skewed
when tree is not balanced.

There are two types of skewed tree.
1. Right Skewed binary tree: A binary tree in which each node is having either only a right
child or no child at all.
2. Left Skewed binary tree: A binary tree in which each node is having either only a left child
or no child at all.


Balanced Binary search tree
There are few binary search tree, which always keeps themselves balanced. Most important
among them are Red-Black Tree (RB-Tree) and AVLtree.
The standard template library (STL) is implemented using this Red-Black Tree (RB-Tree).


TreeSet implementation in JAVA Collections-
TreeSet<> is a class which implements Set<> interface which means that it store only unique
elements. TreeSet<> is implemented using a red-black balanced binary search tree in JAVA
Collections. Since TreeSet<> is implemented using a binary search tree its elements are stored in
sequential order.

Note:- TreeSet is implemented using a binary search tree so add, remove, and contains methods
have logarithmic time complexity O(log (n)), where n is the number of elements in the set.
 */
public class TreeSet_5 {
	public static void main(String[] args) {
		// Create a tree set.
		TreeSet<String> ts = new TreeSet<String>();
		// Add elements to the tree set.
		ts.add("India");
		ts.add("USA");
		ts.add("Brazil");
		ts.add("Canada");
		ts.add("UK");
		ts.add("China");
		ts.add("France");
		ts.add("Spain");
		ts.add("Italy");
		System.out.println(ts);
		}
}
