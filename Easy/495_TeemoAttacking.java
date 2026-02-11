// Problem Summary

// We are given a sorted array representing attack times and a fixed poison duration.
// Each attack causes the target to be poisoned for a certain number of seconds.

// If a new attack happens before the previous poison effect ends, the poison timer resets (instead of stacking).

// The task is to calculate the total number of seconds the target remains poisoned.

// Approach Explanation

// If there are no attacks, return 0.

// Iterate through the attack times starting from index 1.

// For each attack:

// Calculate the gap between the current attack and the previous attack.

// If the gap is greater than or equal to duration, add full duration.

// Otherwise, add only the gap (because the poison overlaps).

// After the loop, add duration for the final attack.

// This works because we only count the non-overlapping contribution of each attack.

// Time and Space Complexity

// Time Complexity: O(n)
// (Single pass through the array)

// Space Complexity: O(1)
// (Only constant variables used)

class Solution {
     public int findPoisonedDuration(int[] timeSeries, int duration) {
          if (timeSeries == null || timeSeries.length == 0) {
               return 0;
          }
          int total = 0;

          for (int i = 1; i < timeSeries.length; i++) {
               int gap = timeSeries[i] - timeSeries[i - 1];
               total += Math.min(duration, gap);
          }

          total += duration;
          return total;
     }
}