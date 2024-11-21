package others_med;


/*problem stmt- Write an algorithm to determine if a number n is happy.

	A happy number is a number defined by the following process:
	
	Starting with any positive integer, replace the number by the sum of the squares of its digits.
	Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not 
	include 1.
	
	Those numbers for which this process ends in 1 are happy.
	Return true if n is a happy number, and false if not.

 

		Example 1:
		
		Input: n = 19
		Output: true
		Explanation:
		12 + 92 = 82
		82 + 22 = 68
		62 + 82 = 100
		12 + 02 + 02 = 1
		
		Example 2:
		
		Input: n = 2
		Output: false
 * 
 * 
 * 
 * 
 */
public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 6;
		boolean res=isHappy(n);
		System.out.println("given number is Happy: " +res);
		

	}
	
	
	    public static boolean isHappy(int n) {
	        if(n == 1 || n == 7)
	        {
	            return true;
	        }
	        while(n >= 10)
	        {
	            int sum = 0;
	            while(n >= 1)
	            {
	                int rem = n % 10;
	                sum += (rem * rem);
	                n /= 10;  
	            }
	            if(sum == 1 || sum == 7)
	            {
	                return true;
	            }
	            n = sum;
	        }
	        return n == 1;
	    }
	}


/*  solution explanation-
 * 
 * if number =1; true 
 * if num=2 ; =>4=>16=>37=>58=>89=>145=>42=>20=>4  -> cycle
 * if num=7 ; =>49=>97=>130=>10=>1 ; true
 * 
 * in num<10 ; only 1, 7 are happy
 * 
 * -> we need to detect for num>10; if the sum of sq of digits has a cycle, it is not happy.
 * 
 * so we use sum function assuming it 0 initially
 * 
 *digit calculation - 
 *digit=n%10
 *
 *sum calculation
 * sum+=digit*digit;
 * n/=10;
 
 * if this sum is =1, or 7 - true, otherwise 
 * 
 * 
 * Time Complexity: O(n*log(n)).
Auxiliary Space: O(1). 
 * 
 * 
 * 
 */

