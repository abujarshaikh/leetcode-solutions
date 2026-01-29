// Problem Summary 

// Given a string representing an Excel column title (like "A", "AB", "ZY"), return its corresponding column number.
// Essentially, convert a base-26 alphabet string to its decimal equivalent.

// Approach Explanation

// Treat the string as a base-26 number, where 'A' = 1, 'B' = 2, … 'Z' = 26.

// Iterate from left to right:

// result=result∗26+(current_char−′A′+1)

// Return the final result.

// Time & Space Complexity

// Time Complexity: O(n) (n = length of columnTitle)

// Space Complexity: O(1)

class Solution {
     public int titleToNumber(String columnTitle) {
          int res = 0;
          for (int i = 0; i < columnTitle.length(); i++) {
               res = res * 26 + (columnTitle.charAt(i) - 'A' + 1);
          }
          return res;
     }
}