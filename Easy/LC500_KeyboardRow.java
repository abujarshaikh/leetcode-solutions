// Problem Summary

// Given an array of words, return only those words that can be typed using letters from a single row of the American keyboard.

// The keyboard has three rows:

// Row 1: qwertyuiop

// Row 2: asdfghjkl

// Row 3: zxcvbnm

// The check is case-insensitive, meaning uppercase and lowercase letters are treated the same.

// Approach (Clear & Interview-Ready)

// Define three strings representing the three keyboard rows.

// For each word:

// Convert it to lowercase.

// Track which keyboard rows its characters belong to.

// If all characters of the word belong to only one row, include it in the result.

// Convert the collected list into a string array and return it.

// This ensures each word is validated independently and efficiently.

// Complexity Analysis

// Let:

// n = number of words

// m = average length of each word

// Time Complexity: O(n × m)
// Each character of every word is checked once.

// Space Complexity: O(n)
// For storing valid words in the result list.
import java.util.*;

class Solution {
     public String[] findWords(String[] words) {
          String row1 = "qwertyuiop";
          String row2 = "asdfghjkl";
          String row3 = "zxcvbnm";

          List<String> list = new ArrayList<>();
          for (String word : words) {
               int[] row = new int[3];
               for (char ch : word.toLowerCase().toCharArray()) {
                    if (row1.indexOf(ch) != -1) {
                         row[0] = 1;
                    } else if (row2.indexOf(ch) != -1) {
                         row[1] = 1;
                    } else if (row3.indexOf(ch) != -1) {
                         row[2] = 1;
                    }
               }
               int sum = row[0] + row[1] + row[2];
               if (sum == 1) {
                    list.add(word);
               }
          }
          String[] res = new String[list.size()];
          for (int i = 0; i < list.size(); i++) {
               res[i] = list.get(i);
          }
          return res;

     }
}