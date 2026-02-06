// Problem Summary

// Given a 32-bit signed integer, convert it to its hexadecimal string representation. For negative values, the conversion should follow two’s complement representation. The output must use lowercase letters and contain no leading zeros except for zero itself.

// Approach Explanation

// Handle zero as a special case. For all other values, repeatedly extract the last four bits using a bitwise AND operation to obtain the corresponding hexadecimal digit. Append the mapped character and shift the number right using an unsigned shift to correctly process negative values. Reverse the accumulated characters to form the final hexadecimal string.

// Time & Space Complexity

// Time Complexity: O(1) — at most 8 iterations for a 32-bit integer

// Space Complexity: O(1) — constant extra space

class Solution {
     public String toHex(int num) {

          if (num == 0)
               return "0";

          String digits = "0123456789abcdef";
          StringBuilder res = new StringBuilder();

          while (num != 0) {
               int rem = num & 15;

               res.append(digits.charAt(rem));

               num >>>= 4;
          }
          return res.reverse().toString();

     }
}