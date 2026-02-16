// Problem Summary

// Given a 32-bit signed integer, reverse its binary representation and return
// the resulting integer.

// The operation must consider all 32 bits, including leading zeros, and produce
// the integer formed after reversing the bit order.

// Approach Explanation
// 🔹 Approach 1: Bit Manipulation (Manual)

// Initialize result = 0

// Iterate 32 times:

// Left shift result by 1

// Extract the last bit of n using (n & 1)

// Add it to result

// Right shift n by 1

// Return result

// This builds the reversed bit number one bit at a time.

// 🔹 Approach 2 (Optimized – Used in Solution)

// Use Java’s built-in method:

// Integer.reverse(n);

// This efficiently reverses all 32 bits internally.
// Time & Space Complexity

// Time Complexity: O(1) → Always 32 iterations

// Space Complexity: O(1) → No extra space used

class Solution {
     public int reverseBits(int n) {
          // int ans=0;
          // for(int i=0;i<32;i++){
          // ans<<=1;
          // ans|=(n&1);
          // n>>=1;
          // }
          // return ans;

          return Integer.reverse(n);
     }
}


