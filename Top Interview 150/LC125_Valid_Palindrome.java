// Problem Summary

// Given a string, determine whether it reads the same forward and backward after ignoring case differences and removing all non-alphanumeric characters (only letters and digits are considered).

// Approach Explanation

// Use a two-pointer technique starting from both ends of the string.
// Skip characters that are not letters or digits.
// Compare characters in a case-insensitive manner.
// If all corresponding characters match, the string is a valid palindrome.

class Solution {
     public boolean isPalindrome(String s) {
          s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
          int i = 0;
          int j = s.length() - 1;
          while (i <= j) {
               if (s.charAt(i) == s.charAt(j)) {
                    i++;
                    j--;
               } else {
                    return false;
               }
          }
          // StringBuilder res=new StringBuilder(s);
          // String x=res.reverse().toString();
          // if(s.equals(x)){
          // return true;
          // }
          return true;
     }
}