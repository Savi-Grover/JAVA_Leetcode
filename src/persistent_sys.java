//find sum of all numbers in string
public class persistent_sys {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc= "Savi123Grover456";
		//String abc= "wer12";
		int res=CalculateSum(abc);
		System.out.println(res);
	}
	
	public static int CalculateSum(String str) {
		 int sum = 0; // To hold the total sum of digits

	        for (char ch : str.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                // Convert the character to its integer value and add to sum
	                sum += ch - '0';
	            }
	        }

	        return sum;
	    }
}
