// 1. Problem Summary

// Given two strings representing binary numbers, compute their sum and return the result as a binary string. The input strings contain only 0 and 1 and have no leading zeros (except "0").

// 2. Approach Explanation

// Use two pointers starting from the end of both strings.

// Add corresponding bits along with a carry.

// Append the result bit (sum % 2) and update the carry (sum / 2).

// Continue until all bits and carry are processed.

// Reverse the constructed result to obtain the final binary string.

// 3. Time & Space Complexity

// Time Complexity: O(n) — where n is the length of the longer string

// Space Complexity: O(n) — for building the result string

class Solution {
     public String addBinary(String a, String b) {
          int x = a.length() - 1, y = b.length() - 1, carry = 0;
          StringBuilder result = new StringBuilder();
          while (x >= 0 || y >= 0 || carry == 1) {
               int sum = carry;

               if (x >= 0)
                    sum += a.charAt(x--) - '0';
               if (y >= 0)
                    sum += b.charAt(y--) - '0';

               result.append(sum % 2);
               carry = sum / 2;
          }
          return result.reverse().toString();
     }
}