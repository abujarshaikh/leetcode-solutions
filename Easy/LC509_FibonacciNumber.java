// Problem Summary 

// Given a non-negative integer n, return the nth number in the Fibonacci sequence.

// The sequence starts with:

// F(0) = 0

// F(1) = 1

// For any n > 1, each number is calculated as the sum of the previous two numbers.

// Approach (Iterative – Optimized)

// Handle base cases: if n <= 1, return n.

// Use two variables:

// a → represents F(n-2)

// b → represents F(n-1)

// Iterate from 2 to n:

// Compute next = a + b

// Shift values forward (a = b, b = next)

// Return b as the final result.

// ✔ Avoids recursion
// ✔ Uses constant space
// ✔ Efficient for constraints (0 ≤ n ≤ 30)

// Complexity Analysis

// Time Complexity: O(n)

// Space Complexity: O(1)

class Solution {
     public int fib(int n) {
          
          if (n <= 1) {
               return n;
          }

          int a = 0;
          int b = 1;
          for (int i = 2; i <= n; i++) {
               int next = a + b;
               a = b;
               b = next;
          }
          return b;
     }
}