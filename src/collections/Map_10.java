package collections;


/*Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in
pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.
 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Explanation:

The bijection can be established as:

'a' maps to "dog".
'b' maps to "cat".

Example 2:

Input: pattern = "abba", s = "dog cat cat fish"

Output: false

Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"

Output: false

 
 * 
 * Explanation of Code:
The code is checking whether a given string pattern and a given string s follow the same pattern. 
This means that for each character in pattern, there is a corresponding word in s, and for each word in s,
there is a corresponding character in pattern.

The code first splits s into an array of words by using the split() method and a 
space character as the delimiter. It then checks whether the number of words in s is the 
same as the number of characters in pattern. 

If they are not the same, the function returns false because the pattern cannot be 
followed if the number of characters and words do not match.

The code then creates two maps: phrase_word and alphabet_inpattern. 
alphabet_inpattern maps characters in pattern to words in s, 
and phrase_word maps words in s to characters in pattern.

The code then iterates through each character in pattern, and for each character, 
it extracts the corresponding word from the words array. It then checks whether the character is already in 
phrase_word. If it is not, it adds the character and the corresponding word to both phrase_word and alphabet_inpattern. 
If the character is already in phrase_word, the code checks whether the stored word in alphabet_inpattern for 
that character is the same as the extracted word. 

If they are not the same, the function returns false. 
The code also checks whether the stored character in alphabet_inpattern for 
the word is the same as the current character. If they are not the same, the function returns false.

Finally, the code returns true if all characters in pattern and all words in s 
have been processed and all checks have passed.
 */
import java.util.HashMap;
import java.util.Map;

public class Map_10 {
	public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> phrase_word = new HashMap<>();  //charToWord
        Map<String, Character> alphabet_inpattern = new HashMap<>();  //wordToChar

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!phrase_word.containsKey(c)) {
            	phrase_word.put(c, word);
            }

            if (!alphabet_inpattern.containsKey(word)) {
            	alphabet_inpattern.put(word, c);
            }

            if (!phrase_word.get(c).equals(word) || !alphabet_inpattern.get(word).equals(c)) {
                return false;
            }
        }

        return true;        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abba";
		String s = "dog cat cat dog";
		boolean res=wordPattern(pattern,s);
		System.out.println(res);
	}

}
