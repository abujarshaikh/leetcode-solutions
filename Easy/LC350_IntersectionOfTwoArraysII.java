// Problem Summary

// Given two integer arrays, find their intersection such that each common element appears in the result as many times as it occurs in both arrays. The order of elements in the result does not matter.

// Approach Explanation

// Use a hash map to store the frequency of each element in the first array. Then iterate through the second array and, whenever an element exists in the map with a positive count, add it to the result and decrement its count. Finally, convert the result list into an array.

// Time & Space Complexity

// Time Complexity: O(n + m) — where n and m are the lengths of the two arrays

// Space Complexity: O(n) — hash map for storing frequencies

import java.util.*;

class Solution {
     public int[] intersect(int[] nums1, int[] nums2) {
          Map<Integer, Integer> map = new HashMap<>();
          List<Integer> res = new ArrayList<>();

          for (int n : nums1) {
               map.put(n, map.getOrDefault(n, 0) + 1);
          }

          for (int n : nums2) {
               if (map.containsKey(n) && map.get(n) > 0) {
                    res.add(n);
                    map.put(n, map.get(n) - 1);
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