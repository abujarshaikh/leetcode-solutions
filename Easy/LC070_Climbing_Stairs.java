//Problem Summary 

// You are given a staircase with n steps. At each move, you can climb either 1 step or 2 steps. The task is to determine how many distinct ways exist to reach the top of the staircase.

// Approach Explanation

// To reach step n, you must come from:

// step n - 1 (taking 1 step), or

// step n - 2 (taking 2 steps)

// So, the number of ways to reach step n is the sum of the ways to reach the previous two steps. This forms a Fibonacci-like pattern.
// Instead of storing all results, we keep only the last two values to optimize space.

//Time & Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(1) (constant extra space)

class Solution {
     public int climbStairs(int n) {
          if (n <= 2)
               return n;
          int step1 = 1;
          int step2 = 2; // current step + first step

          for (int i = 3; i <= n; i++) {
               int nextStep = step2 + step1;
               ;
               step1 = step2;
               step2 = nextStep;
          }
          return step2;
     }
}