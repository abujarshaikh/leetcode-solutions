// Problem Summary 

// Given an integer n, generate a list of strings from 1 to n. Replace numbers divisible by 3 with "Fizz", divisible by 5 with "Buzz", and divisible by both with "FizzBuzz". Otherwise, use the number itself as a string.

// Approach Explanation

// Iterate from 1 to n. For each number, first check divisibility by both 3 and 5, then individually by 5 and 3. Based on the condition, add the appropriate string to the result list.

// Time & Space Complexity

// Time Complexity: O(n) — one pass from 1 to n

// Space Complexity: O(n) — list to store the output

import java.util.*;

class Solution {
     public List<String> fizzBuzz(int n) {
          List<String> list = new ArrayList();
          for (int i = 1; i <= n; i++) {
               if (i % 3 == 0 && i % 5 == 0) {
                    list.add("FizzBuzz");
               } else if (i % 5 == 0) {
                    list.add("Buzz");
               } else if (i % 3 == 0) {
                    list.add("Fizz");
               } else {
                    list.add(Integer.toString(i));
               }
          }
          return list;
     }
}