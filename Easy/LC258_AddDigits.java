// Problem Summary 

// Given a non-negative integer, repeatedly sum its digits until the result becomes a single-digit number, and return that final digit.

// Approach Explanation

// This problem can be solved using the digital root concept.

// A number’s digital root can be computed in constant time using modulo arithmetic:

// If the number is 0, return 0.

// Otherwise, return num % 9, except when the remainder is 0, return 9.

// This avoids loops and repeated digit extraction.

// Time & Space Complexity

// Time Complexity: O(1)

// Space Complexity: O(1)

class Solution {
     public int addDigits(int num) {
          if (num == 0)
               return 0;
          while (num >= 10) {
               int sum = 0;
               while (num > 0) {
                    sum += num % 10;
                    num /= 10;
               }
               num = sum;
          }
          return num;
     }
}