// Problem Summary 

// Given a lowercase string, identify the index of the first character that appears exactly once. If every character repeats, return -1.

// Approach Explanation

// First, count the frequency of each character using a fixed-size array for all lowercase letters. Then scan the string again from left to right and return the index of the first character whose frequency is one. If no such character exists, return -1.

// Time & Space Complexity

// Time Complexity: O(n) — two linear passes over the string

// Space Complexity: O(1) — constant space using a 26-length frequency array

class Solution {
     public int firstUniqChar(String s) {
          int[] freq = new int[26];

          for (char c : s.toCharArray()) {
               freq[c - 'a']++;
          }

          for (int i = 0; i < s.length(); i++) {
               if (freq[s.charAt(i) - 'a'] == 1) {
                    return i;
               }
          }
          return -1;
     }
}