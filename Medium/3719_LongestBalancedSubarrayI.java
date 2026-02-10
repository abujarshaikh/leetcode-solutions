// Problem Summary

// Given an integer array, find the length of the longest contiguous subarray where the count of distinct even numbers equals the count of distinct odd numbers.

// Approach Explanation

// Fix a starting index and expand the subarray to the right.

// Use two HashSets to track distinct even and distinct odd numbers in the current subarray.

// At each step, compare the sizes of both sets.

// If they’re equal, update the maximum length.

// Try all possible subarrays using two loops.

// This brute-force approach works because the input size is small.

// Time and Space Complexity

// Time Complexity: O(n²)
// (Checking all subarrays)

// Space Complexity: O(n)
// (Sets store distinct elements within a subarray)

import java.util.*;

class Solution {
     public int longestBalanced(int[] nums) {
          int n = nums.length;
          int l = 0;

          for (int i = 0; i < n; i++) {
               Set<Integer> even = new HashSet<>();
               Set<Integer> odd = new HashSet<>();

               for (int j = i; j < n; j++) {
                    if (nums[j] % 2 == 0) {
                         even.add(nums[j]);
                    } else {
                         odd.add(nums[j]);
                    }

                    if (even.size() == odd.size()) {
                         l = Math.max(l, j - i + 1);
                    }
               }
          }
          return l;
     }
}