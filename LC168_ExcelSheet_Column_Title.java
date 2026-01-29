// Problem Summary 

// Given a positive integer representing a column number, convert it into its corresponding Excel column title. Excel columns follow a base-26 system using uppercase English letters (A to Z), but without a zero character.

// Approach Explanation

// This problem is similar to converting a number into base-26, with a small twist:

// Excel columns are 1-indexed, not 0-indexed.

// Subtract 1 from the number before each conversion step.

// Repeatedly:

// Find the remainder using % 26

// Convert it to a character ('A' + remainder)

// Reduce the number using / 26

// Build the result in reverse order, then reverse it at the end.

// Time & Space Complexity

// Time Complexity: O(log₍26₎ n)

// Space Complexity: O(1) (ignoring output string)

class Solution {
     public String convertToTitle(int columnNumber) {
          StringBuilder s = new StringBuilder();

          while (columnNumber > 0) {
               columnNumber--;
               char c = (char) (columnNumber % 26 + 'A');
               s.append(c);
               columnNumber /= 26;
          }

          return s.reverse().toString();
     }
}