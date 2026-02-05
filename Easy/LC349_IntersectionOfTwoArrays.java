// Problem Summary (in your own words)

// Given two integer arrays, find all values that appear in both arrays. Each common value should appear only once in the result, and the order of the result does not matter.

// Approach Explanation

// Store all elements of the first array in a set for fast lookup. Then iterate through the second array and add elements to a result set only if they already exist in the first set. This automatically ensures uniqueness. Finally, convert the result set into an array.

// Time & Space Complexity

// Time Complexity: O(n + m) — where n and m are lengths of the two arrays

// Space Complexity: O(n + m) — sets used to store elements and results

import java.util.*;

class Solution {
     public int[] intersection(int[] nums1, int[] nums2) {
          Set<Integer> set = new HashSet<>();
          Set<Integer> res = new HashSet<>();

          for (int n : nums1) {
               set.add(n);
          }
          for (int n : nums2) {
               if (set.contains(n)) {
                    res.add(n);
               }
          }

          int[] ans = new int[res.size()];
          int i = 0;
          for (int n : res) {
               ans[i++] = n;
          }
          return ans;
     }
}
