// Problem Summary

// Given a lowercase string, we need to find the length of the longest substring where all distinct characters appear the same number of times.

// A substring is considered balanced if every unique character in it has equal frequency.

// Approach (Clear & Interview-Ready)

// Iterate over all possible starting indices.

// For each start index:

// Maintain a frequency array of size 26.

// Track:

// distinct → number of unique characters

// maxFreq → highest frequency of any character in the current substring

// Expand the substring one character at a time.

// For each expansion:

// Update frequency and distinct count.

// Update maxFreq.

// If:

// substring length == distinct × maxFreq

// then all characters must have equal frequency → valid balanced substring.

// Keep updating the maximum length found.

// This works because:
// If all distinct characters appear exactly k times, then:

// length = distinct × k

// and maxFreq = k

// Time & Space Complexity

// Time Complexity: O(n²)
// (Two nested loops over string of length n)

// Space Complexity: O(1)
// (Fixed 26-length frequency array)

class Solution {
     public int longestBalanced(String s) {
          int n = s.length();
          int maxLength = 0;

          for (int i = 0; i < n; i++) {
               int[] freq = new int[26];
               int distinct = 0;
               int maxFreq = 0;

               for (int j = i; j < n; j++) {
                    int index = s.charAt(j) - 'a';

                    if (freq[index] == 0) {
                         distinct++;
                    }

                    freq[index]++;
                    maxFreq = Math.max(maxFreq, freq[index]);

                    int length = j - i + 1;

                    if (length == distinct * maxFreq) {
                         maxLength = Math.max(maxLength, length);
                    }
               }
          }

          return maxLength;
     }
}