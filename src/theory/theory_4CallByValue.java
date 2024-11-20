package theory;

//parameter passing - are of 2 types - call-by-value & call-by-reference

/*
//Arguments can be passed from one method to other using parameters. All the basic data types
when passed as parameters are by the passed-by-value. That means a separate copy is created
inside the called method and the variable in the calling method remains unchanged.
*/

public class theory_4CallByValue {
	
	public static void increment(int var)
	{
	var++;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		System.out.println("Value of i before increment is : " + i);
		increment(i);
		System.out.println("Value of i before increment is : " + i);


		//output:
		//Value of i before increment is : 10
		//Value of i before increment is : 10
		
		/*
		 * Analysis:
			· Variable ”i” is declared and the value 10 is initialized to it.
			· Value of ”i” is printed.
			· Increment method is called. When a method is called the value of the parameter is copied
			into another variable of the called method. Flow of control goes to increase() function.
			· Value of var is incremented by 1. But remember, it is just a copy inside the increment
			method.
			· When the method exits, the value of ”i” is still 10.
			
			Points to remember:
			1. Pass by value just creates a copy of variable.
			2. Pass by value, value before and after the method call remain same.
		 */
	}

}
