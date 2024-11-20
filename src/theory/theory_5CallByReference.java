package theory;


/*
		 * Reference variables are used to store memory address of classes as well as arrays. 
		 * Any variable other them 8 primitive data types are reference data type.
		 * Parameter passing of a reference variable is done by copying the address of the variable. This
		method is called pass-by-reference. Since the object is not copied, it is shared, the changes done
		in a called function are also reflected to the caller of the function.
		
		Comparison (==) in reference variable is done by comparing the address of the variable.
		The default value of any reference variable is null.
		Returning reference variable from a method return address of the variable. If the returned address
		is stored in some other variable the locally created object is not destroyed
		
		 JAVA language by default passes by value. Therefore, to make it happen, you need to
		 pass the address of a variable and changing the value of the variable using this address inside the
         called method.

 */
public class theory_5CallByReference {

	private static class MyInt
		{
		int value;
		};
		
		//MyInt below is a ref data type
	public static void increment(MyInt value)
		{
		(value.value)++;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInt x = new MyInt();
		x.value = 10;
		System.out.println("Value of i before increment is: "+ x.value);
		increment(x);
		System.out.println("Value of i after increment is: "+ x.value);
	}

	
	/*
	 * output:
	 * Value of i before increment is: 10
	   Value of i after increment is: 11
	   
	   Analysis: Object of class MyInt is passed to the method. Since the objects are passed by
	   reference. Value change in increment() function is reflected to the original object of the caller
       function.
       
		Points to remember:
		1. Call by reference is implemented indirectly by passing the address of an instance of class
		or array to the function.
	   
	   */
}





