// Problem Summary

// Given a positive integer, determine whether it is a perfect square without using any built-in square root functions. The number must be expressible as the square of an integer.

// Approach Explanation

// Use binary search on the possible integer range from 1 to num. For each mid value, compute its square and compare it with the given number. Narrow the search space based on whether the square is smaller or larger. If an exact match is found, return true; otherwise, return false after the search ends.

// Time & Space Complexity

// Time Complexity: O(log n) — binary search reduces the range each step

// Space Complexity: O(1) — constant extra space

class Solution {
     public boolean isPerfectSquare(int num) {
          long left = 1;
          long right = num;

          while (left <= right) {
               long mid = (right + left) / 2;
               long square = mid * mid;

               if (square == num) {
                    return true;
               } else if (square < num) {
                    left = mid + 1;
               } else {
                    right = mid - 1;
               }
          }
          return false;
     }
}