// 1. Problem Summary

// Given an integer, determine whether it reads the same forward and backward.
// If the number remains unchanged when its digits are reversed, it is a palindrome; otherwise, it is not.
// Approach
// Negative numbers are immediately not palindromes because of the minus sign.

// Reverse the digits of the number mathematically (without converting to a string).

// Compare the reversed value with the original number.

// If both are equal, return true; otherwise, return false.

// This approach avoids extra string handling and keeps the logic clean.

// Time Complexity: O(log₁₀ n) — number of digits in the integer

// Space Complexity: O(1) — constant extra space

// Solution

class Solution {
    public static boolean isPalindrome(int x) {
        int pali=0;
        int og=x;
        while(og>0){
            pali=(pali*10)+(og%10);
            og/=10;
        }
        return pali==x;
        // String s=String.valueOf(x);
        // return s.equals(new StringBuilder(s).reverse().toString());
    }
}