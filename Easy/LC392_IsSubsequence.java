// Problem Summary

// Check whether one string can be formed by deleting some characters from another string without changing the relative order of the remaining characters.

// Approach

// Use two pointers: one for the target subsequence string and one for the source string.

// Move through the source string character by character.

// Advance the subsequence pointer only when characters match.

// If all characters of the subsequence are matched in order, return true.

// Time & Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(1)

// (where n is the length of the source string)

class Solution {
     public boolean isSubsequence(String s, String t) {
          if (s.length() == 0) {
               return true;
          }
          int i = 0;
          int j = 0;

          while (i < s.length() && j < t.length()) {
               if (s.charAt(i) == t.charAt(j)) {
                    i++;
                    j++;
               } else {
                    j++;
               }
          }

          return i == s.length();
     }
}