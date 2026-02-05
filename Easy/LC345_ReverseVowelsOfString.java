// Problem Summary 

// Given a string, reverse only the vowels while keeping all non-vowel characters in their original positions. Vowels can appear multiple times and in both uppercase and lowercase.

// Approach Explanation

// Convert the string into a character array and use two pointers—one starting from the beginning and one from the end. Move each pointer until it points to a vowel, then swap the two vowels. Continue this process until the pointers cross, and finally convert the array back into a string.

// Time & Space Complexity

// Time Complexity: O(n) — each character is processed at most once

// Space Complexity: O(n) — due to the character array used for in-place swaps

class Solution {
     public String reverseVowels(String s) {
          char[] ch = s.toCharArray();

          int left = 0;
          int right = ch.length - 1;
          while (left < right) {

               while (left < right && !isVowel(ch[left]))
                    left++;
               while (left < right && !isVowel(ch[right]))
                    right--;

               char temp = ch[left];
               ch[left] = ch[right];
               ch[right] = temp;

               left++;
               right--;
          }
          return new String(ch);
     }

     private boolean isVowel(char c) {
          return "aeiouAEIOU".indexOf(c) != -1;
     }
}