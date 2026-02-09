// Problem Summary 

// Given a binary array, determine the maximum length of any contiguous segment consisting only of 1s.

// Approach Explanation

// Traverse the array once while keeping a counter for the current streak of consecutive 1s.

// Increment the counter when a 1 is encountered.

// Reset it to zero when a 0 appears.

// Track the maximum streak seen so far during traversal.

// This ensures the longest run of consecutive 1s is captured efficiently.

// Time and Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(1)

class Solution {
     public int findMaxConsecutiveOnes(int[] nums) {
          int count = 0;
          int maxCount = 0;

          for (int n : nums) {
               if (n == 1) {
                    // count=(n==1)?count+1:0;
                    // maxCount=Math.max(maxCount,count);
                    count++;
                    if (count > maxCount) {
                         maxCount = count;
                    }
               } else {
                    count = 0;
               }
          }
          return maxCount;
     }
}