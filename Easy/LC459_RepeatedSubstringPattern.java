// Problem Summary (GitHub-safe)

// Determine whether a string can be formed by repeating one of its substrings multiple times to recreate the entire string.

// Approach

// Use the KMP prefix (LPS) array to find the longest proper prefix that is also a suffix. (KMP = Knuth–Morris–Pratt algorithm)

// If such a prefix exists, the length of the repeating unit is n - lps[n - 1].

// If the total length is divisible by this unit length, the string is constructed by repeating a substring.

// Time & Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(n)

class Solution {
     public boolean repeatedSubstringPattern(String s) {
          // String x=s+s;
          // return x.substring(1,x.length()-1).contains(s);

          int n = s.length();
          int[] lps = new int[n];
          int len = 0;
          int i = 1;

          while (i < n) {
               if (s.charAt(i) == s.charAt(len)) {
                    len++;
                    lps[i] = len;
                    i++;
               } else {
                    if (len != 0) {
                         len = lps[len - 1];
                    } else {
                         lps[i] = 0;
                         i++;
                    }
               }
          }
          int res = lps[n - 1];
          return res > 0 && n % (n - res) == 0;
     }
}
