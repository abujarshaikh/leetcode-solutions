// 1️⃣ Problem Summary (GitHub-safe)

// Given an integer array, find the length of the longest subsequence where the difference between the maximum and minimum elements is exactly 1.

// A subsequence can skip elements, but the relative order must remain the same.

// If no such subsequence exists, return 0.

// 2️⃣ Approach (Concise & Interview-Ready)

// Count the frequency of each number using a HashMap.

// For every unique number k, check if k + 1 exists in the map.

// If it exists, the subsequence formed by all occurrences of k and k + 1 is harmonious.

// Track the maximum sum of frequencies of such adjacent keys.

// Return the maximum length found.

// ✔ Key Insight:
// A harmonious subsequence only depends on frequencies of two consecutive integers.

// 3️⃣ Complexity Analysis

// Time Complexity: O(n)

// One pass to build the frequency map

// One pass over unique keys

// Space Complexity: O(n)

// In worst case, all elements are unique

import java.util.*;

class Solution {
     public int findLHS(int[] nums) {
          Map<Integer, Integer> map = new HashMap<>();
          for (int n : nums) {
               map.put(n, map.getOrDefault(n, 0) + 1);
          }
          int maxLength = 0;
          for (int key : map.keySet()) {
               if (map.containsKey(key + 1)) {
                    maxLength = Math.max(maxLength, map.get(key) + map.get(key + 1));
               }
          }
          return maxLength;
     }
}