// Problem Summary 

// Given a word consisting of uppercase and lowercase English letters, determine whether its capitalization usage is correct.

// A word is valid if:

// All letters are uppercase (e.g., "USA"), or

// All letters are lowercase (e.g., "leetcode"), or

// Only the first letter is uppercase and the remaining letters are lowercase (e.g., "Google").

// Return true if the word follows one of these patterns; otherwise, return false.

// Approach (Optimized – Single Pass)

// Handle edge case (null or empty string).

// Traverse the word once and count uppercase letters.

// The word is valid if:

// All characters are uppercase, or

// No characters are uppercase, or

// Exactly one uppercase letter exists and it is at index 0.

// ✔ Single traversal
// ✔ No extra string creation
// ✔ Constant extra space
// ✔ Runtime optimized (0 ms)

// Complexity Analysis

// Time Complexity: O(n)

// Space Complexity: O(1)

// class Solution {
//     public boolean detectCapitalUse(String word) {
//         if(word.length()==0 || word==null){
//             return false;
//         }
//         if(word.equals(word.toUpperCase())){
//             return true;
//         }
//         if(word.equals(word.toLowerCase())){
//             return true;
//         }
//         String s=Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase();
//         return s.equals(word);
//     }
// }
class Solution {
     public boolean detectCapitalUse(String word) {
          if (word == null || word.length() == 0)
               return false;

          int capitalCount = 0;

          for (char c : word.toCharArray()) {
               if (Character.isUpperCase(c)) {
                    capitalCount++;
               }
          }

          return capitalCount == word.length() || capitalCount == 0
                    || (capitalCount == 1 && Character.isUpperCase(word.charAt(0)));
     }
}
