package arrays;

//We can define two dimensional ( 2d matrix of rows & cols )  or multidimensional array ( also matrix of diff size ). It is an array of array.

public class Introduction_2D {
	public static void main(String[] args) {
		twoDArrayExample();
		}


	public static void twoDArrayExample()
	{
	int[][] arr = new int[4][2];
	int count = 0;
	for (int i = 0; i < 4; i++)
	for (int j = 0; j < 2; j++)
	arr[i][j] = count++;
	print2DArray(arr, 4, 2);
	}
	public static void print2DArray(int[][] arr, int row, int col) {
	for (int i = 0; i < row; i++)
	for (int j = 0; j < col; j++)
	System.out.println(" " + arr[i][j]);
	}
	
	//Analysis:- An array is created with dimension 4 x 2. The array will have 4 rows and 2 columns.
	
	
	/*
    syntax of 2D array
	
	datatype[][] nameOfarray={[],[]}          = this will have elements separated by , for each dimention in []
	
	or
	
	datatype[][] nameOfArray= new datatype[sizeofArray1][sizeofArray2];
	*/
	
	//in 2d or multidimentioanl array - both or all datatypes are similar
}
