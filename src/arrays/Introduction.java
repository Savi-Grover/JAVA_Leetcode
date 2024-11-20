package arrays;

//An array is a data structure
//used to store multiple data elements of the same data type. All the data is stored sequentially. The
//value stored at any index can be accessed in constant time

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayExample();

	}

	public static void arrayExample() {
		int[] arr = new int[10];  // [] is called subscript operator
		for (int i = 0; i < 10; i++)
		{
		arr[i] = i;
		}
		printArray(arr,10);
		}

	public static void printArray(int arr[], int count)
		{
		System.out.println("Values stored in array are : ");
		for (int i = 0; i < count; i++)
		{
		System.out.println(" " + arr[i]);
		}
	}
	/*
	//Point to Remember:
	1. Array index always starts from 0 index and highest index is size -1.
	2. The subscript operator has highest precedence if you write arr[2]++. Then the value of
	arr[2] will be incremented.
	
	3. syntax of 1D array
	
	datatype[] nameOfarray={}          = this will have elements separated by ,
	
	or
	
	datatype[] nameOfArray= new datatype[sizeofArray];
	
	
*/

}
