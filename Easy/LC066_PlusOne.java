// 1. Problem Summary

// Given an array of digits representing a non-negative integer (most significant digit first), increment the number by one and return the resulting digits as an array. The input contains no leading zeros.

// 2. Approach Explanation

// Traverse the array from the last digit to the first.

// If the current digit is less than 9, increment it and return the array.

// If the digit is 9, set it to 0 and continue carrying to the left.

// If all digits become 0, create a new array with a leading 1 followed by zeros.

// This directly simulates addition with carry.

// 3. Time & Space Complexity

// Time Complexity: O(n) — worst case when all digits are 9

// Space Complexity: O(n) — only when a new array is created

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){

            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] arr=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}