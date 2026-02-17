// Problem Summary 

// Given a sentence containing words separated by single spaces, reverse the characters of each word individually while keeping the original word order and spacing unchanged.

// Approach Explanation

// Split the string using space " " to extract individual words.

// For each word:

// Use StringBuilder to reverse its characters.

// Append the reversed word to a result StringBuilder.

// Remove the trailing space added during construction.

// Return the final string.

// This keeps word positions intact while reversing only internal characters.

//Time & Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(n)

// Where n is the length of the input string.

class Solution {
     public String reverseWords(String s) {
          String[] words = s.split(" ");
          StringBuilder result = new StringBuilder();

          for (String word : words) {
               StringBuilder sb = new StringBuilder(word);
               result.append(sb.reverse()).append(" ");
          }

          result.setLength(result.length() - 1);

          return result.toString();
     }
}
