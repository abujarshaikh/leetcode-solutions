// Problem Summary 

// Given a positive integer n, determine whether it is a perfect number.

// A perfect number is a number that equals the sum of all its positive divisors excluding itself.
// Return true if it satisfies the condition; otherwise return false.

// Approach Explanation

// If num <= 1, return false (since 1 is not perfect).

// Initialize sum = 1 because 1 is always a divisor.

// Iterate from 2 to √num.

// If i divides num:

// Add i to sum

// Add num / i (its paired divisor)

// Avoid double-counting when i == num / i.

// Finally, return sum == num.

// This reduces unnecessary iterations by checking only up to √num.

// Time & Space Complexity

// Time Complexity: O(√n)

// Space Complexity: O(1)
class Solution {
     public boolean checkPerfectNumber(int num) {
          if (num <= 1) {
               return false;
          }
          int sum = 1;
          for (int i = 2; i * i <= num; i++) {
               if (num % i == 0) {
                    sum += i;
                    if (1 != num / i) {
                         sum += num / i;
                    }
               }
          }
          return sum == num;
     }
}