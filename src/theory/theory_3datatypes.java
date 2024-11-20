package theory;

public class theory_3datatypes {

	/*Primitive/ Basic Data Types
	 * 
Primitive data types are the basic data types, which are defined in the JAVA language. There are
8 different primitive data types - byte, short, int, long, float, double, boolean, char. All primitive
values can be stored in a fixed amount of memory (between one and eight bytes)
*/
	
	/*
	 * Reference variables are used to store memory address of classes as well as arrays. Any variable
other them 8 primitive data types are reference data type.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		int maxInteger = Integer.MAX_VALUE;
		int minInteger = Integer.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		float minFloat = Float.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		double minDouble = Double.MIN_VALUE;
		System.out.println("Range of byte :: " + minByte + " to " + maxByte);
		System.out.println("Range of short :: " + minShort + " to " + maxShort);
		System.out.println("Range of integer :: "+minInteger + " to "+maxInteger);
		System.out.println("Range of long :: " + minLong + " to " + maxLong);
		System.out.println("Range of float :: " + minFloat + " to " + maxFloat);
		System.out.println("Range of double :: " + minDouble + " to " + maxDouble);


	}

}
