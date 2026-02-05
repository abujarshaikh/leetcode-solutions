// Problem Summary 

// Given an integer, determine whether it can be expressed as a power of 3. The number must be positive and equal to 3^x for some integer exponent.

// Approach Explanation

// First, eliminate non-positive numbers since powers of three are always positive. Repeatedly divide the number by 3 while it is divisible. If the final reduced value becomes 1, the number is a power of three; otherwise, it is not.

// Time & Space Complexity

// Time Complexity: O(log₃ n) — the number is divided by 3 each step

// Space Complexity: O(1) — constant extra space

class Solution {
     public boolean isPowerOfThree(int n) {
          if (n <= 0)
               return false;

          while (n % 3 == 0) {
               n /= 3;
          }
          return n == 1;
     }
}