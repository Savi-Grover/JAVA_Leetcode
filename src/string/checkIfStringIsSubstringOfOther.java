package string;

public class checkIfStringIsSubstringOfOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String txt1 = "geeksforgeeks";
	        String pat1 = "eks";

	        String txt2 = "geeksforgeeks";
	        String pat2 = "xyz";

	        // Outputs
	        System.out.println("Output 1: " + findSubstring(txt1, pat1));
	        System.out.println("Output 2: " + findSubstring(txt2, pat2));
	}
	
	 public static int findSubstring(String txt, String pat) {
	        // Use indexOf to search for the substring
	        int index = txt.indexOf(pat);
	        return index; // Returns -1 if 'pat' is not found
	    }

}
