// 1. Problem Summary

// Given an array of strings, determine the longest prefix that appears at the beginning of every string.
// If the strings do not share any common starting characters, return an empty string.

// 2. Approach Explanation

// Take the first string as the initial prefix.

// Compare this prefix with each subsequent string.

// While the current string does not start with the prefix, shorten the prefix from the end.

// Stop early if the prefix becomes empty.

// The remaining prefix is the longest common prefix.

// 3. Time & Space Complexity

// Time Complexity: O(n * m)
// where n is the number of strings and m is the length of the prefix

// Space Complexity: O(1) — no extra space apart from variables

// Solution

class Solution {
     public String longestCommonPrefix(String[] strs) {
          if (strs == null || strs.length == 0) {
               return "";
          }
          Arrays.sort(strs);
          String str1 = strs[0];
          String str2 = strs[strs.length - 1];
          int i = 0;
          while (i < str1.length()) {
               if (str1.charAt(i) == str2.charAt(i)) {
                    i++;
               } else {
                    break;
               }
          }
          return i == 0 ? "" : str1.substring(0, i);
     }
}