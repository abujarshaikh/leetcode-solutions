// 1. Problem Summary 

// You are given daily stock prices. You can buy the stock once and sell it once on a later day. The goal is to find the maximum profit possible from this single transaction. If no profit can be made, return 0.

// 2. Approach Explanation

// Use a single-pass greedy approach:

// Track the minimum price so far while traversing the array.

// At each day, calculate the profit if you sold on that day.

// Update the maximum profit whenever a higher profit is found.

// This ensures buying always happens before selling and avoids unnecessary comparisons.

// 3. Time & Space Complexity

// Time Complexity: O(n) — single traversal of the array

// Space Complexity: O(1) — constant extra space

public class LC121_Best_Time_to_Buy_and_Sell_Stock {
     public static void main(String[] args) {
          int[] arr = { 7, 6, 5, 4, 3 };
          System.err.println(maxProfit(arr));
     }

     public static int maxProfit(int[] prices) {
          int minPrice = prices[0];
          int maxProfit = 0;
          for (int i = 1; i < prices.length; i++) {
               if (prices[i] < minPrice) {
                    minPrice = prices[i];
               }
               int profit = prices[i] - minPrice;

               if (profit > maxProfit) {
                    maxProfit = profit;
               }
          }
          return maxProfit;

     }

}
