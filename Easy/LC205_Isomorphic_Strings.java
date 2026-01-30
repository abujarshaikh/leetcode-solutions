// Problem Summary

// Given two strings of equal length, determine whether characters in the first string can be consistently replaced to form the second string.
// Each character must always map to the same character, and no two different characters may map to the same one. Character order must remain unchanged.

// Approach Explanation

// Traverse both strings simultaneously.

// Maintain a one-to-one mapping between characters of the first string and the second.

// For each character pair:

// If a mapping already exists, verify it matches.

// Otherwise, ensure the target character isn’t already mapped by another character.

// If all character pairs follow a consistent mapping, the strings are isomorphic.

// Time & Space Complexity

// Time Complexity: O(n) — single pass through the strings

// Space Complexity: O(1) — constant space (ASCII character set)

import java.util.*;

class Solution {
     public boolean isIsomorphic(String s, String t) {
          if (s.length() != t.length()) {
               return false;
          }
          Map<Character, Character> map1 = new HashMap<>();
          // Map<Character,Character> map2=new HashMap<>();
          for (int i = 0; i < s.length(); i++) {
               char c1 = s.charAt(i);
               char c2 = t.charAt(i);

               // if(map2.containsKey(c2)){
               // if(map2.get(c2)!=c1){
               // return false;
               // }
               // }else{
               // map2.put(c2,c1);
               // }

               if (map1.containsKey(c1)) {
                    if (map1.get(c1) != c2) {
                         return false;
                    }
               } else {
                    if (map1.containsValue(c2)) {
                         return false;
                    }
                    map1.put(c1, c2);
               }

          }
          return true;
     }
}