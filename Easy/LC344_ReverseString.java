//  Problem Summary 

// You are given a character array representing a string. The task is to reverse the characters in place, meaning you must modify the original array without using extra memory.

// Approach Explanation

// Use a two-pointer technique:

// Start one pointer at the beginning and another at the end of the array.

// Swap the characters at these positions.

// Move the pointers toward each other until they meet.

// This reverses the array directly without creating any additional data structures.

// Time & Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(1) (in-place, no extra memory used)

class Solution {
     public void reverseString(char[] s) {
          int l = 0;
          int r = s.length - 1;

          while (l < r) {
               char temp = s[l];
               s[l] = s[r];
               s[r] = temp;
               l++;
               r--;
          }
          // StringBuilder str=new StringBuilder(String.valueOf(s));
          // String str1=str.reverse().toString();
          // s=str1.toCharArray();
     }
}