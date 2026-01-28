// 1. Problem Summary

// Given a number numRows, generate the first numRows of Pascal’s Triangle. Each row starts and ends with 1, and every inner element is the sum of the two elements directly above it from the previous row.

// 2. Approach Explanation

// Create a list to store all rows of the triangle.

// For each row index i:

// Start the row with 1.

// For inner positions, calculate the value using the previous row’s adjacent elements.

// End the row with 1.

// Add each constructed row to the result list.

// This builds the triangle row by row using previously computed values.

// 3. Time & Space Complexity

// Time Complexity: O(n²) — total elements generated across all rows

// Space Complexity: O(n²) — storage for the triangle

import java.util.*;

public class LC118_Pascals_Triangle {
     public static void main(String[] args) {
          System.err.println(generate(6));

     }

     public static List<List<Integer>> generate(int numRows) {
          List<List<Integer>> res = new ArrayList();

          if (numRows == 0)
               return res;

          List<Integer> firstRow = new ArrayList<>();
          firstRow.add(1);
          res.add(firstRow);

          for (int i = 1; i < numRows; i++) {

               List<Integer> prevRow = res.get(i - 1);
               List<Integer> currRow = new ArrayList<>();
               currRow.add(1);
               for (int j = 0; j < i - 1; j++) {
                    currRow.add(prevRow.get(j) + prevRow.get(j + 1));
               }
               currRow.add(1);
               res.add(currRow);

          }
          return res;
     }
}
