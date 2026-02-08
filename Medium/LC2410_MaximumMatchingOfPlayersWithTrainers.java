// Problem Summary 

// Given two arrays representing players’ minimum training requirements and trainers’ capacities, match at most one trainer to one player such that a trainer can train a player only if their capacity meets or exceeds the player’s requirement. The objective is to maximize the number of matched players.

// Approach Explanation

// Sort both the players’ requirements array and the trainers’ capacities array.

// Use two pointers to iterate through players and trainers.

// Attempt to match the least demanding player with the smallest suitable trainer.

// When a trainer satisfies a player, count the match and move to the next player.

// Always move to the next trainer after each comparison.

// This greedy matching ensures the maximum number of valid pairs.

// Time and Space Complexity

// Time Complexity: O(n log n + m log m) due to sorting

// Space Complexity: O(1) (excluding sorting overhead)

import java.util.*;

class Solution {
     public int matchPlayersAndTrainers(int[] players, int[] trainers) {
          Arrays.sort(players);
          Arrays.sort(trainers);

          int i = 0;
          int j = 0;

          while (i < players.length && j < trainers.length) {
               if (trainers[j] >= players[i]) {
                    i++;
               }
               j++;
          }
          return i;

     }
}