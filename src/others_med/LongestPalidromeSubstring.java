package others_med;

public class LongestPalidromeSubstring {

		//check if string is null or has 1 char- - substrinf=s
	    public static String longestPalindrome(String s) {
	        if (s == null || s.length() < 2) {
	            return s;
	        }

	        // Preprocess the string to handle even length palindromes
	        String processedString = preprocess(s);

	        int[] p = new int[processedString.length()]; // Array to store palindrome lengths
	        int center = 0, right = 0; // Center and right boundary of current palindrome
	        int maxLen = 0, maxCenter = 0; // Length and center of longest palindrome
	        
	        
	        //lopp will run until length -1 of processed string
	        for (int i = 1; i < processedString.length() - 1; i++) {
	        	
	        	//mirror at ith index
	            int mirror = 2 * center - i; // Mirror index of i

	            if (right > i) {
	                p[i] = Math.min(right - i, p[mirror]);
	            }

	            // Expand around center i
	            while (i + 1 + p[i] < processedString.length() && i - 1 - p[i] >= 0 && 
	                   processedString.charAt(i + 1 + p[i]) == processedString.charAt(i - 1 - p[i])) {
	                p[i]++;
	            }

	            // Update center and right boundary if needed
	            if (i + p[i] > right) {
	                center = i;
	                right = i + p[i];
	            }

	            // Update longest palindrome
	            if (p[i] > maxLen) {
	                maxLen = p[i];
	                maxCenter = i;
	            }
	        }

	        int start = (maxCenter - maxLen) / 2;
	        
	        //predefined string function of finding substring
	        return s.substring(start, start + maxLen);
	    }

	    // Preprocess the string by adding '#' between characters
	    private static String preprocess(String s) {
	    	
	    	//start the enpty string with ^#
	        StringBuilder sb = new StringBuilder("^#");
	        for (char c : s.toCharArray()) {
	            sb.append(c).append("#");
	        }
	        
	        //insert $ at the end of string
	        sb.append("$");
	        System.out.println(sb);
	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        String str = "abababa";
	        System.out.println("Longest palindrome substring is: " + longestPalindrome(str)); // Output: anana
	    }

	 
	
}
