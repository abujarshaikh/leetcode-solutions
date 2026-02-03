// Problem Summary (in your own words, GitHub-safe)

// An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
// Given an integer n, determine whether it qualifies as an ugly number.

// Approach Explanation

// If n is less than or equal to 0, it cannot be an ugly number.

// Repeatedly divide n by 2, 3, and 5 as long as it is divisible by them.

// After removing all allowed prime factors:

// If the remaining value is 1, the number is ugly.

// Otherwise, it contains some other prime factor.

// Time & Space Complexity

// Time Complexity: O(log n)
// Each division reduces the value of n.

// Space Complexity: O(1)
// No extra data structures used.

class Solution {
     public boolean isUgly(int n) {
          if (n <= 0)
               return false;

          int[] prime = { 2, 3, 5 };

          for (int p : prime) {
               while (n % p == 0) {
                    n /= p;
               }
          }

          return n == 1;
     }
}