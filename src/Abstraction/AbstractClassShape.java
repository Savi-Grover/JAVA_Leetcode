package Abstraction;

/*
 * An abstract method is a method which does not have a definition. Such methods are declared with
abstract keyword.

A class which has at least one abstract method need to be declared as abstract. 

We cannot create objects of an abstract class. (A class which does not have any abstract method can also be
declared as abstract to prevent its object creation.).
 */
public abstract class AbstractClassShape {
	
	//Abstract Method
	public abstract double area();
	
	//Abstract Method
	public abstract double perimeter();

}

/*
Those classes, which extend above class,
need to implement these two functions to become concrete class whose instances can be created.
*/

