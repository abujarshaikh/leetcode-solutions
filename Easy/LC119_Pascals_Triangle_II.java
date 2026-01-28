// 1. Problem Summary 

// Given a row index, generate and return only that specific row of Pascal’s Triangle (0-indexed), where each element is formed by adding the two numbers directly above it in the triangle.

// 2. Approach Explanation

// Use a single list and build the row iteratively:

// Start with a list containing 1.

// For each new row, update elements from right to left so previous values are not overwritten.

// Insert 1 at the beginning for every row.

// After reaching the desired index, return the list.

// This approach avoids generating the entire triangle.

// 3. Time & Space Complexity

// Time Complexity: O(n²) — building up to the target row

import java.util.*;

public class LC119_Pascals_Triangle_II {
     public static void main(String[] args) {
          System.err.println(generate(6));
     }

     public static List<Integer> generate(int rowNum) {
          List<Integer> res = new ArrayList<>();
          res.add(1);
          long ans = 1;

          if (rowNum == 0)
               return res;

          for (int i = 1; i <= rowNum; i++) {
               ans = ans * (rowNum - i + 1) / i;
               res.add((int) ans);
          }
          return res;
     }
}
