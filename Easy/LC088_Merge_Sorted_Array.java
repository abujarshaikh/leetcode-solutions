// 1. Problem Summary

// You’re given two integer arrays that are already sorted. The first array has extra space at the end to hold all elements from the second array. The task is to merge both arrays into one sorted array by modifying the first array directly, without returning a new array.

// 2. Approach Explanation

// Use a three-pointer technique starting from the end of both arrays:

// One pointer at the last valid element of nums1

// One pointer at the last element of nums2

// One pointer at the last index of nums1

// Compare elements from the back and place the larger one at the end. This avoids overwriting useful values in nums1 and completes the merge in a single pass.

// 3. Time & Space Complexity

// Time Complexity: O(m + n)

// Space Complexity: O(1) (in-place merge)

class Solution {
     public void merge(int[] nums1, int m, int[] nums2, int n) {
          int k = m + n - 1;
          int i = m - 1;
          int j = n - 1;
          while (j >= 0) {
               if (i >= 0 && nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    k--;
                    i--;
               } else {
                    nums1[k] = nums2[j];
                    k--;
                    j--;
               }
          }
     }
}