package others_easy;

import java.util.HashSet;
import java.util.Set;
//FORD
//Check if there is any common character in two given strings

/*
 * Examples: 

Input: s1 = "geeksforgeeks", s2 = "geeks"
Output: Yes

Input: s1 = "geeks", s2 = "for"
Output: No
 */
public class CommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "hello";
        String string2 = "world";
        if (commonChars(string1, string2)) {
            System.out.println(
                "Yes");
        }
        else {
            System.out.println(
                "No");
        }

	}
	public static boolean commonChars(String str1,
            String str2)
{
	// Convert the strings into sets of characters
	Set<Character> set1 = new HashSet<>();
		for (char c : str1.toCharArray()) 
		{
		set1.add(c);
		}
	Set<Character> set2 = new HashSet<>();
		for (char c : str2.toCharArray()) 
		{
		set2.add(c);
		} // Find the intersection of the sets
	for (char c : set1) {
		if (set2.contains(c)) {
		return true;
		}
	}
	return false;
	}
}
