// Problem Summary

// Given a string containing uppercase and lowercase English letters, determine the maximum length of a palindrome that can be formed using those characters. Each character may be used only as many times as it appears, and letter case must be respected.

// Approach

// Use a fixed-size frequency array to count occurrences of each character.

// Add the largest even portion of each count to the palindrome length.

// If any character has an odd count, allow exactly one character to be placed in the center.

// Return the total calculated length.

// Time & Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(1) (constant 128-size array)

class Solution {
     public int longestPalindrome(String s) {
          int[] freq = new int[128];
          int length = 0;
          for (char c : s.toCharArray()) {
               freq[c]++;
          }

          for (int i = 0; i < 128; i++) {
               int val = freq[i];
               length = length + (val / 2) * 2;
               if (length % 2 == 0 && val % 2 == 1) {
                    length++;
               }
          }

          return length;
     }
}