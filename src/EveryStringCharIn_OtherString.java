import java.util.HashMap;

public class EveryStringCharIn_OtherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello";
		String str2= "elloygrueyh";
		boolean res= areAllCharsPresent(str1,str2);
		System.out.println(res);
	}
	
	// Method to check if all characters of str1 are in str2
    public static boolean areAllCharsPresent(String str1, String str2) {
        // Convert str2 to a character frequency map
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char c : str2.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Check each character of str1 in the charCount map
        for (char c : str1.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false; // Character is missing or not enough occurrences
            } else {
                // Decrement the count of the character in the map
                charCount.put(c, charCount.get(c) - 1);
            }
        }
        return true;
    }

	
}
