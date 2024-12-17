


//FORD test1
//Write a function that run-length encodes a string of characters. 
//Eg: given "aaaabbbcaaa"  would return "a4b3c1a3"
public class LengthEncoding {

	//Write a function that run-length encodes a string of characters. 
	//Eg: given "aaaabbbcaaa"  would return "a4b3c1a3"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabbbcaaa";
        encoding(str);
	}
	
	public static void encoding(String str)
    {
        int n = str.length();
        for (int i = 0; i < n; i++) {
 
            // Count occurrences of current character
            int count = 1;
            while (i < n - 1
                   && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
 
            // Print character and its count
            System.out.print(str.charAt(i) + "" + count);
        }
    }

}
