// 1️⃣ Problem Summary (GitHub-safe)

// Given an integer array representing candy types, Alice can eat only half of the total candies (since the total count is even).

// She wants to maximize the number of different candy types she eats while respecting the limit of n / 2 candies.

// Return the maximum number of distinct candy types she can consume.

// 2️⃣ Approach Explanation

// Let n be the total number of candies.

// Alice can eat at most n / 2 candies.

// Count how many unique candy types exist using a HashSet.

// The answer is the minimum of:

// Number of distinct candy types

// n / 2

// Why?

// If unique types ≤ n/2, she can eat one of each type.

// If unique types > n/2, she is limited to eating only n/2 types.

// 3️⃣ Time & Space Complexity

// Time Complexity: O(n)
// (Single pass to insert into HashSet)

// Space Complexity: O(n)
// (HashSet storing up to n unique types)

import java.util.*;

class Solution {
     public int distributeCandies(int[] candyType) {
          Set<Integer> set = new HashSet<>();
          int n = candyType.length;
          for (int i = 0; i < n; i++) {
               set.add(candyType[i]);
          }
          return Math.min(set.size(), n / 2);
     }
}