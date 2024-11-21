package others_easy;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1221;
		boolean res=isPalindrome(n);
		System.out.println("this number is palindrom:" +res);
	}

	
	    public static boolean isPalindrome(int x) {
	        if(x<0)return false;
	        
	        //convert num to string
	        String num = Integer.toString(x);
	        
	        //consider left char  as 0 and right char as number length-1
	        int left = 0;
	        int right = num.length()-1;
	        
	        //
	        while(left<=right){
	            if(num.charAt(left)==num.charAt(right)){
	                left++;
	                right--;
	            }else{
	                return false;
	            }
	        }
	        return true;
	    }
	}


