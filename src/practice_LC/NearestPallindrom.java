package practice_LC;
/*
 * Efficient Approach: This approach is based on a little bit of mathematical understanding and logical intuition.

For any possible number, there are 5 cases:
(Say the number is 4723)

Case 1 – The next closest palindrome has one digit extra : So here it will be 10001.
Case 2 – The next closest palindrome has one digit less: So here it will be 999.
Case 3 – The next closest palindrome has the same number of digits.
For case 3 there are 3 subcases:

The middle digit remains same. Postfix is the mirror image of prefix. So here 47(prefix) – 74(postfix)–>4774.
The middle digit increases by 1. Postfix is the mirror image of prefix. So here 4884.
The middle digit decreases by 1. Postfix is the mirror image of prefix. So here 4664.
Among these 5 candidates:
The candidate having the least absolute difference from the original number is the answer. In this case it is 4774.

Overall, the program iterates over the candidate palindromic numbers and finds the one that is closest to the 
input number. The program uses basic mathematical operations such as finding the prefix of the input number and 
creating palindromic versions of numbers to achieve this.

Follow below steps to solve this problem:

-Create a vector to store candidate palindromic numbers.
-Determine the length of the input number and the middle index.
-If the input number has a length of 1, return the string of that number minus 1 as the closest 
palindromic number.
-Add two candidate palindromic numbers to the vector: the smallest palindromic number greater than the input 
number, and the largest palindromic number smaller than the input number.
-Create a vector of three numbers that have the same prefix as the input number: the prefix itself, the prefix 
incremented by 1, and the prefix decremented by 1.
-For each number in the prefix vector, create a palindromic number by appending its reverse to itself. If the 
input number has an odd length, remove the last character of the reverse before appending.
-Add each candidate palindromic number to the vector.
-Iterate over the candidate vector and find the candidate with the smallest absolute difference to the input 
number. If there are multiple candidates with the same absolute difference, select the smallest one.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an integer, find the nearest palindrome to that number.
public class NearestPallindrom {
	public static String closestPalindrome(String n) {
        // Initialize a list to store the candidate palindromic numbers
        List<Long> candidates = new ArrayList<>();

        // Get the length of the input number n
        int length = n.length();

        // Calculate the index of the middle element (or the element just after the middle for even-length numbers)
        int mid = (length + 1) / 2;

        // If the input number has only one digit, the closest palindromic number is (n-1) 
        //any number between 0 to 9 has pallindrom equal to (n-1)
        if (length == 1) {
            long num = Long.parseLong(n);
            return String.valueOf(num - 1);
        }

        // Add two candidates: (10^n + 1) and (10^(n-1) - 1)
        // ie if number is 9898 = 4 digit; then pallindroms can be 10^4+1=10001 or (10^3)-1=999
        candidates.add((long) Math.pow(10, length) + 1);
        candidates.add((long) Math.pow(10, length - 1) - 1);

        // Extract the prefix (first half) of the input number
        //to construct mirror image of the original number, we need mid
        int prefix = Integer.parseInt(n.substring(0, mid));

        // Generate three possible prefixes by incrementing and decrementing the original prefix
        List<Integer> temp = Arrays.asList(prefix, prefix + 1, prefix - 1);

        // Construct the candidate palindromic numbers using the generated prefixes
        for (int i : temp) {
            String res = String.valueOf(i);
            // If the length of the input number is odd, exclude the last character while constructing the palindromic number
            if ((length & 1) != 0) {
                res = res.substring(0, res.length() - 1);
            }
            // Create the palindromic number by appending the reverse of the prefix
            String peep = i + new StringBuilder(res).reverse().toString();
            candidates.add(Long.parseLong(peep));
        }

        // Initialize variables to keep track of the minimum difference and the closest palindromic number
        long minDiff = Long.MAX_VALUE;
        long result = Long.parseLong(n);
        long tip = Long.parseLong(n);

        // Iterate through the candidate palindromic numbers and find the closest one to the input number
        for (int i = 0; i < 5; i++) {
            long candidate = candidates.get(i);
            if (candidate != tip && minDiff > Math.abs(candidate - tip)) {
                result = candidate;
                minDiff = Math.abs(candidate - tip);
            } else if (Math.abs(candidate - tip) == minDiff) {
                result = Math.min(result, candidate);
            }
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String num = "78787";
        System.out.println(closestPalindrome(num));
    }
    
   // Time complexity: O(len(num))
   // Auxiliary space: O(1)
}