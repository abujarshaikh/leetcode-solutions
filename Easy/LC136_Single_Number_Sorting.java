// Problem Summary

// Given an integer array where every element appears exactly twice except one, find and return the element that appears only once.

// Approach Explanation (Sorting-Based)

// First, sort the array so that identical elements are placed next to each other.
// Then iterate through the array in steps of two and compare adjacent elements.
// If a pair does not match, the first element of that pair is the single number.
// If no mismatch is found, the last element in the array is the unique one.

// Time & Space Complexity

// Time Complexity: O(n log n) (due to sorting)

// Space Complexity: O(1) (ignoring sorting implementation overhead)

class Solution {
     public int singleNumber(int[] nums) {
          Arrays.sort(nums);
          for (int i = 0; i < nums.length - 1; i += 2) {
               if (nums[i] != nums[i + 1]) {
                    return nums[i];
               }
          }

          return nums[nums.length - 1];
     }
}