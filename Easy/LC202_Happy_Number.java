// Problem Summary 

// Given a positive integer, repeatedly replace it with the sum of the squares of its digits.
// If this process eventually reaches 1, the number is considered happy.
// If it falls into a repeating cycle that never reaches 1, it is not happy.
// The task is to return whether the given number is happy or not.

// Approach Explanation

// Continuously compute the sum of the squares of digits of the number.

// Reduce the number until it becomes a single digit.

// Use the known mathematical observation:

// Only 1 and 7 lead to a happy number when reduced to a single digit.

// If the final single digit is 1 or 7, return true; otherwise, return false.

// This avoids extra space like hash sets and keeps the logic simple.

// Time & Space Complexity

// Time Complexity: O(log n) per iteration (digit processing), bounded by a small constant loop

// Space Complexity: O(1) (no extra data structures)

class Solution {
     public boolean isHappy(int n) {
          while (n >= 10) {
               int sum = 0;
               while (n > 0) {
                    int rem = n % 10;
                    sum += rem * rem;
                    n /= 10;
               }
               n = sum;
          }
          if (n == 7) {
               return true;
          } else if (n < 10 && n != 1) {
               return false;
          }
          return true;
     }
}