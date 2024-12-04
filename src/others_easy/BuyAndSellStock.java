package others_easy;

/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the 
future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 
 */
public class BuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices= {7,1,5,3,6,4};
		int n=prices.length;
		
		//first approach
		//int res=maxProfit(prices);
		//System.out.println("maximum profit out selling stock is :"  +res);
		
		//second appraoch- traverse one by one and accumilita  profit 
		// we just need to capture minium of all array to find buy price
		//assuming minSoFar= prices[0]
		int res1=maxProfit1(prices);
		System.out.println("maximum profit out selling stock is :"  +res1);
	}
	
	private static int maxProfit1(int[] prices) {
		int minSoFar= prices [0];
		int n = prices.length;
		int res=0;
		
		//sell loop
		for ( int i=1 ; i<n ; i++) {
			minSoFar=Math.min(minSoFar, prices[i]);
			
			//res or profit = price- minisoFar
			res=Math.max(res, prices[i]-minSoFar);
		}
		return res;
	}

	public static int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0;

        // Explore all possible ways to buy and sell stock
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max(res, prices[j] - prices[i]);      //always j-1 as selling is done in future
            }
        }
        return res;
    }
    
	
	/*
	 * [Naive Approach] By exploring all possible pairs – O(n^2) Time and O(1) Space
The idea is to use two nested loops to explore all the possible ways to buy and sell stock. 
The outer loop decides the day to buy the stock and the inner loop decides the day to sell the stock. 
The maximum difference between the selling price and buying price between every pair of days will be our answer. 
	 */
	
	

}
