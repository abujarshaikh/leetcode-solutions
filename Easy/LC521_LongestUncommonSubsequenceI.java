// Problem Summary 

// Given two strings a and b, return the length of the longest string that is a subsequence of exactly one of them.

// If both strings are identical, then no such subsequence exists, so return -1.

// Approach (Key Observation – Simplified Logic)

// The important insight:

// If a and b are equal → every subsequence of one is also a subsequence of the other → return -1.

// If a and b are not equal → the longer string itself is always an uncommon subsequence.

// Because a string cannot be a subsequence of another shorter string unless they are equal.

// So:

// If a.equals(b) → return -1

// Otherwise → return max(a.length(), b.length())

// ✔ No need to generate subsequences
// ✔ Pure logical observation
// ✔ Extremely efficient

// Complexity Analysis

// Time Complexity: O(1)
// (String equality check is constant for small constraint size ≤ 100)

// Space Complexity: O(1)

class Solution {
     public int findLUSlength(String a, String b) {
          if (a.equals(b)) {
               return -1;
          }
          return Math.max(a.length(), b.length());
     }
}