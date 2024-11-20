package theory;


/*
 * There are three types of methods. Class Methods, Instance Methods and Constructors. By default,
all the methods are instance methods.

	=>Class Methods (Static): The static modifier is used to create class methods. Class methods with
	static modifier with them should be invoked with the class name without the need of creating even
	a single instance of the class
	
	=>Instance Methods (Non-Static): These methods can only be invoked over an instance of the
	class.

Some points regarding Instance methods and Class methods:
	1. Instance methods can access other instance methods and instance variables directly.
	
	2. Instance methods can access class methods and variables directly.
	
	3. Class methods can access other class methods and class variables directly.
	
	4. Class methods cannot access instance methods and instance variables directly. To access
	instance variable and methods they need to create and instance (object) of class.
	
	5. The special keyword “this” is valid only inside instance methods (and invalid inside class
	methods ) as “this“ refers to the current instance.
	
	
	=>Constructor: It is a special kind of method, which is invoked over objects when they are created.
	Constructor methods have the same name as the class. Constructor method is used to initialize the
	various fields of the object. For the class that does not have constructors, JAVA language provides
	default constructors for them.
 */
public class theory_7kindsMethods {

}
