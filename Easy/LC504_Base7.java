// Problem Summary

// Given an integer, return its representation in base 7 as a string.

// The solution must:

// Correctly handle positive numbers

// Correctly handle negative numbers

// Return "0" when the input is zero

// Approach (Clear & Interview-Ready)

// Handle the edge case where num == 0.

// Determine if the number is negative and store the sign.

// Convert the number to base 7 by:

// Repeatedly dividing by 7

// Collecting remainders

// Build the result string from the remainders.

// Add the negative sign if required.

// Alternatively, Java provides a built-in shortcut:
// Integer.toString(num, 7)

// Complexity Analysis

// Time Complexity: O(log₇ |num|)
// Each division reduces the number by a factor of 7.

// Space Complexity: O(log₇ |num|)
// For storing digits of the base 7 representation.

class Solution {
     public String convertToBase7(int num) {
          if (num == 0) {
               return "0";
          }
          StringBuilder sb = new StringBuilder();
          boolean flag = (num < 0);
          while (Math.abs(num) > 0) {
               int rem = Math.abs(num) % 7;
               sb.insert(0, rem);
               num /= 7;
          }
          if (flag) {
               sb.insert(0, "-");
          }
          return sb.toString();
          // return Integer.toString(num,7);
     }
}