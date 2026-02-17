// Problem Summary 

// We are given a number representing how many LEDs are turned on in a binary watch. The watch uses 4 LEDs for hours (0–11) and 6 LEDs for minutes (0–59).

// The task is to return all valid times that can be formed such that the total number of set bits (1s) in the hour and minute equals the given number.

// Formatting rules:

// Hours must not have leading zeros.

// Minutes must always be two digits.

// Approach

// Iterate through all valid hours (0–11).

// Iterate through all valid minutes (0–59).

// For each time:

// Count the number of set bits using Integer.bitCount().

// If the total equals turnedOn, format and add the time to the result.

// Use String.format("%d:%02d", hour, minute) to ensure correct formatting.

// Since the total possible combinations are only 12 × 60 = 720, a brute-force solution is efficient and clean.

// Complexity Analysis

// Time Complexity: O(1)
// (At most 720 combinations — constant)

// Space Complexity: O(k)
// (Where k is the number of valid times returned)

import java.util.*;

class Solution {
     public List<String> readBinaryWatch(int turnedOn) {
          List<String> res = new ArrayList();

          for (int i = 0; i < 12; i++) {
               for (int j = 0; j < 60; j++) {
                    int bits = Integer.bitCount(i) + Integer.bitCount(j);

                    if (bits == turnedOn) {
                         res.add(String.format("%d:%02d", i, j));
                    }
               }
          }
          return res;
     }
}