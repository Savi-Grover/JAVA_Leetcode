package stack;
/*
 * Concept of Stack-
A stack is a memory in which values are stored and retrieved in “last in first out” manner. Data is
added to stack using push operation and data is taken out of stack using pop operation.


System stack and Method Calls
-When the method is called, the current execution is stopped and the control goes to the called
method. After the called method exits / returns, the execution resumes from the point at which the
execution was stopped.
-To get the exact point at which execution should be resumed, the address of the next instruction is
stored in the stack. When the method call completes, the address at the top of the stack is taken
out.


Points to remember:
1. Methods are implemented using a stack.
2. When a method is called the address of the next instruction is pushed into the stack.
3. When a method is finished the address of the execution is taken out of the stack.
 */
public class SystemStackandMethodCalls {
	public static void function2()
	{
	System.out.println("fun2 line 1");
	}
	public static void function1()
	{
	System.out.println("fun1 line 1");
	function2();
	System.out.println("fun1 line 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main line 1");
		function1();
		System.out.println("main line 2");

	}

}
