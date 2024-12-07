package others_easy;

public class ValidPallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Too hot to hoot";
		
		
		//method 1
		//boolean res = CheckSentencePalidrom(s);
		//System.out.println(res);
		
		//method2
		//boolean res1 = CheckSentencePalidrom1(s);
		//System.out.println(res1);
		
		//method 3 = BEST
		boolean res3 = CheckSentencePalidrom3(s);
		System.out.println(res3);
		
	}

	
	private static boolean CheckSentencePalidrom3(String s) {
		 if (s.isEmpty() || s.length()<2) {
	        	return true;
	        }
	        int n= s.length();
	        int i =0 ;
	        int j= s.length()-1;

	        while ( i<j)
	        {

	            char currFirst = s.charAt(i);
	        	char currLast = s.charAt(j);

	            if (!Character.isLetterOrDigit(s.charAt(i)))
	            i++;

	            else if (!Character.isLetterOrDigit(s.charAt(j)))
	            j--;
	            else{
	            if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
	        			return false;
	        		}

	                i++;
	        		j--;

	            }

	        }

	        return true;
	    }
	


	//using 2 pointers at extreme ends
	private static boolean CheckSentencePalidrom1(String s) {
		// TODO Auto-generated method stub
		int i=0;
		int j= s.length()-1;
		
		while ( i<j) {
			
			//skip value if not digit /or alphbet
			if(!Character.isLetterOrDigit(s.charAt(i)))
				i++;
			
			if(!Character.isLetterOrDigit(s.charAt(j)))
				j--;
			
			if(Character.isLetterOrDigit(s.charAt(i))==Character.isLetterOrDigit(s.charAt(j))){
				i++;
				j--;
			}
			else
                return false;
		}
		
		//default true
		
		return true;
	}

	@SuppressWarnings("unlikely-arg-type")
	private static boolean CheckSentencePalidrom(String s) {
		// TODO Auto-generated method stub
		
		//create new string removing all number
		StringBuilder s1= new StringBuilder();
		
		for ( char ch : s.toCharArray()) {
			if (Character.isLetterOrDigit(ch)) {
				s1.append(Character.toLowerCase(ch));
			}
		}
		
		// find reverse of this new string
        StringBuilder rev = new StringBuilder(s1.toString());
        rev.reverse();
  
        // compare string and its reverse
        return s1.toString().equals(rev.toString());
		
		
	}

}
