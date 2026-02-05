// Problem Summary

// Given a sorted array of unique integers, group consecutive numbers into ranges. Each range should exactly represent contiguous values from the array and be formatted as a single number if it contains one element, or as "start->end" if it contains multiple elements.

// Approach Explanation

// Iterate through the array while tracking the start of the current range. Continue moving forward as long as the next number is exactly one greater than the current. When a break in continuity occurs, finalize the current range, format it correctly, and start a new range. Add the last range after the loop ends.

// Time & Space Complexity

// Time Complexity: O(n) — single pass through the array

// Space Complexity: O(1) extra space (excluding the output list)

import java.util.*;

class Solution {
     public List<String> summaryRanges(int[] nums) {
          List<String> res = new ArrayList<>();

          if (nums.length == 0)
               return res;

          int start = nums[0];

          for (int i = 1; i <= nums.length; i++) {
               if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                    if (start == nums[i - 1]) {
                         res.add(String.valueOf(start));
                    } else {
                         res.add(start + "->" + nums[i - 1]);
                    }
                    if (i < nums.length)
                         start = nums[i];
               }
          }
          return res;
     }
}