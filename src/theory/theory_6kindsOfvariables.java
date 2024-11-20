package theory;

/*
 * 		1. Instance Variables (Non-Static): They are instance variables so they are unique to each
		instance/object of a class.
		
		2. Class Variables (Static): A class variable is any field with the static modifier. These
		variables are linked with the class not with the objects of the (obj) class. There is exactly one copy
		of these variables regardless of how many instances of the class are created.
		
		3. Local Variables: the temporary variables in a method are called local variables. The local
		variables are only visible to the method in which they are declared. The parameters that are
		passed to the methods are also local variables of the called method.

 */
public class theory_6kindsOfvariables {
	
	//Class Variables
	private static int TotalBulbCount = 0;
	
	//Instance Variables
	private boolean isOn=false;
	
	//Constructor
	public theory_6kindsOfvariables(){
	TotalBulbCount++;
	}
	//Class Method
	public static int getBulbCount(){
	return TotalBulbCount;
	}
	
	//Instance Method
	public void turnOn() {
	isOn = true;
	}
	
	//Instance Method
	public void turnOff() {
	isOn = false;
	}
	
	//Instance Method
	public boolean isOnFun(){
	return isOn;
	}


}
