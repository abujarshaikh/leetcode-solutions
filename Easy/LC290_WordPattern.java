// Problem Summary (in your own words)

// Given a pattern string and a space-separated sentence, determine whether each character in the pattern maps to exactly one unique word in the sentence and vice versa, forming a one-to-one correspondence.

// Approach Explanation

// Split the sentence into words using spaces.

// If the number of words does not match the pattern length, return false.

// Use two hash maps to maintain a bidirectional mapping:

// character → word

// word → character

// While iterating, ensure both mappings remain consistent.

// If any conflict is found, return false; otherwise, return true.

// Time & Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(n)

import java.util.*;

class Solution {
     public boolean wordPattern(String pattern, String s) {
          String[] words = s.split(" ");

          if (pattern.length() != words.length) {
               return false;
          }

          Map<Character, String> map1 = new HashMap<>();
          Map<String, Character> map2 = new HashMap<>();

          for (int i = 0; i < pattern.length(); i++) {
               char ch = pattern.charAt(i);
               String word = words[i];

               if (map1.containsKey(ch)) {
                    if (!map1.get(ch).equals(word)) {
                         return false;
                    }
               } else {
                    if (map2.containsKey(word)) {
                         return false;
                    }
                    map1.put(ch, word);
                    map2.put(word, ch);
               }
          }
          return true;
     }
}