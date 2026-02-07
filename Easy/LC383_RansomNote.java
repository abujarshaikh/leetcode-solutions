// Problem Summary

// Determine whether a target string can be formed using characters from another
// string, where each character from the source string can be used at most once.

// Approach

// If the target string is longer than the source, return false immediately.

// Use a fixed-size frequency array to count character occurrences in the source
// string.

// Traverse the target string and decrement the corresponding frequency.

// If any required character is unavailable (frequency becomes zero), return
// false.

// If all characters are successfully matched, return true.

// Time & Space Complexity

// Time Complexity: O(n + m)

// Space Complexity: O(1) (constant 26-size array)

class Solution {
     public boolean canConstruct(String ransomNote, String magazine) {

          if (ransomNote.length() > magazine.length())
               return false;

          int[] freq = new int[26];

          for (char c : magazine.toCharArray()) {
               freq[c - 'a']++;
          }

          // for(int i=0;i<magazine.length();i++){
          // freq[magazine.charAt(i)-'a']++;
          // }

          // for(int i=0;i<ransomNote.length();i++){
          // int j=ransomNote.charAt(i)-'a';
          // if(freq[j]--==0)return false;
          // }

          for (char c : ransomNote.toCharArray()) {
               if (freq[c - 'a'] == 0) {
                    return false;
               }
               freq[c - 'a']--;
          }
          return true;
     }
}