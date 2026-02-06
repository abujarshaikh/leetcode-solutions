// Problem Summary 

// Given two strings where the second is formed by shuffling the first and adding one extra lowercase letter, identify and return the additional character.

// Approach Explanation

// Use the XOR operation on all characters from both strings. Identical characters cancel each other out due to XOR properties, leaving only the extra character from the second string as the final result.

// Time & Space Complexity

// Time Complexity: O(n) — single pass over both strings

// Space Complexity: O(1) — constant extra space

import java.util.*;

class Solution {
     public char findTheDifference(String s, String t) {
          // Set<Character> set1=new HashSet<>();
          // Set<Character> set2=new HashSet<>();

          // int[] freq=new int[26];

          char res = 0;

          for (char c : s.toCharArray()) {
               // set1.add(c);
               // freq[c-'a']--;
               res ^= c;
          }

          for (char c : t.toCharArray()) {
               res ^= c;
               // if(!set1.contains(c))return c;
               // freq[c-'a']++;
          }

          // for(int i=0;i<26;i++){
          // if(freq[i]==1){
          // return (char)(i+'a');
          // }
          // }
          return res;
     }
}