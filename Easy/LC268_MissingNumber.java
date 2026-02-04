// Problem Summary (in your own words)

// You are given an array of n unique integers where each value lies between 0 and n. Since exactly one number from this range is missing, the task is to identify and return that missing number.

// Approach Explanation

// Initialize xor = 0

// XOR all numbers from 0 to n

// XOR all values in the given array

// The final XOR result is the missing number

// Time & Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(1)

class Solution {
     public int missingNumber(int[] nums) {
          int xor = nums.length;

          for (int i = 0; i < nums.length; i++) {
               xor = xor ^ i ^ nums[i];
          }
          return xor;
     }
}