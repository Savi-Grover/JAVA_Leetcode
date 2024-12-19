package others_med;

import java.util.ArrayList;
import java.util.List;

public class CheckIfRearranged_toA_Palindome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcgdjsjabcgdjs";
		boolean asw=CheckIfCanBeAPalidrome(str);
		System.out.println(asw);

	}

	private static boolean CheckIfCanBeAPalidrome(String str) {
		// TODO Auto-generated method stub
		
		
		 // Create a list
        List<Character> list = new ArrayList<Character>();
        
     // For each character in input strings,
        // remove character if list contains
        // else add character to list
        for (int i = 0; i < str.length(); i++) 
        {
            if (list.contains(str.charAt(i)))
                list.remove((Character)str.charAt(i));
            else
                list.add(str.charAt(i));
        }
        
     // if string length is even
        if (str.length() % 2 == 0
                && list.isEmpty() 
            || (str.length() % 2 == 1
                && list.size()
                       == 1)) 
            return true;
       
        // if string length is odd
        else
            return false;
		
	}

}
