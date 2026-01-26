// You are given an integer array and a target value.
// Your task is to find two different elements in the array whose sum is equal to the given target.

// Each input guarantees exactly one valid pair

// You cannot use the same element twice

// The order of the returned indices does not matter

// You must return the indices, not the values

// Solution

import java.util.*;

class Solution {
     public int[] twoSum(int[] nums, int target) {
          HashMap<Integer, Integer> map = new HashMap<>();
          for (int i = 0; i < nums.length; i++) {
               int sub = target - nums[i];
               if (map.containsKey(sub)) {
                    return new int[] { map.get(sub), i };
               }
               map.put(nums[i], i);
          }
          return new int[] { -1, -1 };
     }
}
