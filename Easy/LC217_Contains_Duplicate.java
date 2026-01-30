// Problem Summary

// Given an integer array, determine whether any value appears more than once.
// Return true if at least one duplicate exists; otherwise, return false.

// Approach Explanation

// Traverse the array while tracking seen elements.

// If an element is encountered again, a duplicate exists → return true.

// If all elements are unique after traversal → return false.

// This can be efficiently done using a hash-based structure for constant-time lookups.

// Time & Space Complexity

// Time Complexity: O(n) — single pass through the array

// Space Complexity: O(n) — to store previously seen elements

import java.util.*;

class Solution {
     public boolean containsDuplicate(int[] nums) {
          Set<Integer> set = new HashSet();
          for (int n : nums) {
               if (!set.add(n)) {
                    return true;
               }

          }
          return false;
     }
}