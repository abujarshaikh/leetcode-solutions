// Problem Summary 

// Given a rectangular area, determine the length and width such that their product equals the area. The length must be greater than or equal to the width, and the difference between them should be as small as possible. Return the dimensions as [length, width].

// Approach Explanation

// To minimize the difference between length and width, we search for factor pairs closest to each other. Starting from the square root of the area and moving downward, the first divisor found guarantees the smallest difference while ensuring the length is greater than or equal to the width. Once a valid divisor is found, the corresponding length is computed and returned.

// Time and Space Complexity

// Time Complexity: O(√area)

// Space Complexity: O(1)

class Solution {
     public int[] constructRectangle(int area) {
          for (int i = (int) Math.sqrt(area); i >= 1; i--) {
               if (area % i == 0) {
                    int j = area / i;
                    return new int[] { j, i };
               }
          }
          return new int[0];
     }
}