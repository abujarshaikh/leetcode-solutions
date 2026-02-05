// Problem Summary

// You and an opponent take turns removing 1 to 3 stones from a single pile, starting first. Whoever removes the last stone wins. Given the total number of stones n, determine whether the first player can guarantee a win assuming both players play optimally.

// Approach Explanation

// This is a classic game theory problem.
// If n is a multiple of 4, every move you make (1–3 stones) leaves your opponent a winning position.
// If n is not a multiple of 4, you can always remove stones in a way that forces your opponent into a multiple-of-4 position, ensuring your win.

// Key insight:

// Losing positions → n % 4 == 0

// Winning positions → n % 4 != 0

// Time & Space Complexity

// Time Complexity: O(1)

// Space Complexity: O(1)

class Solution {
     public boolean canWinNim(int n) {
          if (n % 4 == 0) {
               return false;
          }
          return true;
     }
}