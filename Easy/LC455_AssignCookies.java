// Problem Summary 

// Given two arrays representing children’s minimum cookie size requirements and available cookie sizes, assign at most one cookie to each child such that a child is satisfied only if the cookie size meets or exceeds their requirement. The goal is to maximize the number of satisfied children.

// Approach Explanation

// Sort both the children’s greed array and the cookies array.

// Use two pointers:

// One for iterating through children (least greedy first).

// One for iterating through cookies (smallest size first).

// Try to satisfy each child with the smallest possible cookie that meets their requirement.

// If a cookie satisfies a child, move to the next child; always move to the next cookie.

// This greedy strategy ensures optimal matching.

// Time and Space Complexity

// Time Complexity: O(n log n + m log m) due to sorting

// Space Complexity: O(1) (ignoring sorting overhead)
import java.util.*;

class Solution {
     public int findContentChildren(int[] g, int[] s) {
          Arrays.sort(g);
          Arrays.sort(s);

          int i = 0;
          int j = 0;

          while (i < g.length && j < s.length) {
               if (s[j] >= g[i]) {
                    i++;
               }
               j++;

          }
          return i;
     }
}