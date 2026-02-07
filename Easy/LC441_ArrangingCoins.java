// Problem Summary

// Given a number of coins, determine how many complete rows of a staircase can be formed where each row uses one more coin than the previous row.

// Approach

// Observe that the total coins needed for k complete rows is k * (k + 1) / 2.

// Use binary search to find the maximum k such that this value does not exceed n.

// Return the largest valid k.

// Time & Space Complexity

// Time Complexity: O(log n)

// Space Complexity: O(1)

class Solution {
     public int arrangeCoins(int n) {
          // int i=1;
          // int count=0;

          // while(i<=n){
          // n=n-i;
          // count++;
          // i++;
          // }
          // return count;

          long left = 1;
          long right = n;

          while (left <= right) {
               long mid = left + (right - left) / 2;
               long coins = mid * (mid + 1) / 2;

               if (coins == n) {
                    return (int) mid;
               } else if (coins < n) {
                    left = mid + 1;
               } else {
                    right = mid - 1;
               }
          }
          return (int) right;
     }
}