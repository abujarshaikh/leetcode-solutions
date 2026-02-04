// Problem Summary (in your own words)

// Given an integer array, rearrange it in-place so that all zero values are moved to the end, while preserving the original order of the non-zero elements.

// Approach Explanation

// Use a pointer to track the position for the next non-zero element.
// First, iterate through the array and place all non-zero values at the front.
// Then, fill the remaining positions with zeros.

// Time & Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(1)

class Solution {
     public void moveZeroes(int[] nums) {
          int n = 0;
          for (int num : nums) {

               // for(int i=0;i<nums.length;i++){
               if (num != 0) {
                    nums[n++] = num;
                    // n++;
               }
               // }
          }
          while (n < nums.length) {
               nums[n++] = 0;
               // n++;
          }
     }
}