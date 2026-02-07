// Problem Summary 

// Given an array of size n containing numbers in the range 1 to n, find all numbers within this range that do not appear in the array.

// Approach

// Since each value lies between 1 and n, use the array indices to mark visited numbers.

// For each value x, mark the element at index x - 1 as negative to indicate presence.

// After marking, any index containing a positive value represents a missing number.

// Collect index + 1 for all such positions.

// Time & Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(1) (excluding the output list)

import java.util.*;

class Solution {
     public List<Integer> findDisappearedNumbers(int[] nums) {
          List<Integer> list = new ArrayList<>();
          for (int i = 0; i < nums.length; i++) {
               int idx = Math.abs(nums[i]) - 1;
               if (nums[idx] > 0) {
                    nums[idx] = -nums[idx];
               }
          }
          for (int i = 0; i < nums.length; i++) {
               if (nums[i] > 0) {
                    list.add(i + 1);
               }
          }
          return list;

     }
}