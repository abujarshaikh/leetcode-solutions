// Problem Summary

// Given an integer array and an integer k, determine whether there exist two equal values such that the absolute difference between their indices is at most k.
// Return true if such a pair exists; otherwise, return false.

// Approach Explanation

// Use a hash map to store each number and its most recent index.

// Traverse the array once:

// If the number has appeared before, check the distance between indices.

// If the distance is ≤ k, return true.

// Otherwise, continue scanning.

// If no valid pair is found, return false.

// This ensures fast lookups and efficient index comparison.

// Time & Space Complexity

// Time Complexity: O(n) — single pass through the array

// Space Complexity: O(n) — hash map to store indices

import java.util.*;

class Solution {
     public boolean containsNearbyDuplicate(int[] nums, int k) {

          Map<Integer, Integer> map = new HashMap<>();
          for (int i = 0; i < nums.length; i++) {
               if (!map.containsKey(nums[i])) {
                    map.put(nums[i], i);
               } else {
                    int index = map.get(nums[i]);
                    if (Math.abs(index - i) <= k) {
                         return true;
                    } else {
                         map.put(nums[i], i);
                    }
               }
          }
          return false;
     }
}