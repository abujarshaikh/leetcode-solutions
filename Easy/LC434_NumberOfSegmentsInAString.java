// Problem Summary

// Given a string, count how many segments it contains, where a segment is defined as a continuous sequence of non-space characters separated by spaces.

// Approach

// Split the string using space as the delimiter.

// Iterate through the resulting parts and count only non-empty strings.

// This ensures multiple, leading, or trailing spaces do not affect the result.

// Time & Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(n) (due to string splitting)

class Solution {
     public int countSegments(String s) {
          if (s.length() == 0)
               return 0;
          String[] str = s.split(" ");
          int count = 0;

          for (String word : str) {
               if (!word.isEmpty()) {
                    count++;
               }
          }
          return count;
          // return s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;//1ms

     }
}