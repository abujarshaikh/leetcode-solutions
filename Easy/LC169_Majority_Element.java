// Problem Summary

// Given an array of integers, find the element that appears more than ⌊n / 2⌋ times.
// It is guaranteed that such an element always exists.

// Approach Explanation

// Use the Boyer–Moore Voting Algorithm.
// Maintain a candidate and a counter.
// When the counter is zero, select the current element as the new candidate.
// Increase the count if the current element matches the candidate; otherwise, decrease it.
// By the end, the remaining candidate is the majority element.

// Time & Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(1)

class Solution {
     public int majorityElement(int[] nums) {
          int element = 0;
          int count = 0;

          for (int i = 0; i < nums.length; i++) {
               if (count == 0) {
                    element = nums[i];
               }
               if (nums[i] == element) {
                    count++;
               } else {
                    count--;
               }

          }
          return element;
     }
}