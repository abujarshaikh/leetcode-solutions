// Problem Summary 

// Given an integer, check whether it can be represented as a power of 4. The number must be positive and equal to 4^x or some integer exponent.

// Approach Explanation

// First, discard non-positive values since powers of four are always positive. Repeatedly divide the number by 4 while it is divisible. If the final value becomes 1, the number is a power of four; otherwise, it is not.

// Time & Space Complexity

// Time Complexity: O(log₄ n) — each iteration divides the number by 4

// Space Complexity: O(1) — constant extra space

class Solution {
     public boolean isPowerOfFour(int n) {
          if (n <= 0)
               return false;

          while (n % 4 == 0) {
               n /= 4;
          }
          return n == 1;
     }
}