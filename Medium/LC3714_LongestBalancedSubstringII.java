// Problem Summary

// Given a string containing only 'a', 'b', and 'c', find the length of the longest substring where all distinct characters present appear the same number of times.

// A substring is considered balanced if:

// It may contain 1, 2, or 3 distinct characters.

// Every distinct character inside it occurs equally often.

// Approach 

// Since the string contains only three possible characters, a balanced substring can fall into three cases:

// Only one distinct character

// Any consecutive block of the same character is valid.
// → Compute the maximum length of identical consecutive characters.

// Exactly two distinct characters

// For each pair (a,b), (b,c), (a,c):

// Traverse segments containing only those two characters.

// Use a prefix difference technique:

// Track diff = count(a) - count(b)

// If the same diff appears again, the substring between them has equal counts.

// Use a HashMap to store first occurrences of each difference.

// All three distinct characters

// For all three characters to be balanced:

// Let:

// x = count(a) - count(b)

// y = count(b) - count(c)

// If the same (x, y) pair repeats, the substring between them has equal counts of all three.

// Store encoded (x, y) in a HashMap.

// Finally, return the maximum among all three cases.

// Complexity Analysis

// Time Complexity: O(n)
// Each character is processed a constant number of times.

// Space Complexity: O(n)
// HashMaps store prefix states in worst case.
import java.util.*;

class Solution {
     public int longestBalanced(String s) {
          char[] cs = s.toCharArray();
          int x = calc1(cs);
          int y = Math.max(calc2(cs, 'a', 'b'), Math.max(calc2(cs, 'b', 'c'), calc2(cs, 'a', 'c')));
          int z = calc3(cs);
          return Math.max(x, Math.max(y, z));
     }

     private int calc1(char[] s) {
          int res = 0;
          int i = 0, n = s.length;
          while (i < n) {
               int j = i + 1;
               while (j < n && s[j] == s[i]) {
                    j++;
               }
               res = Math.max(res, j - i);
               i = j;
          }
          return res;
     }

     private int calc2(char[] s, char a, char b) {
          int res = 0;
          int i = 0, n = s.length;
          while (i < n) {
               while (i < n && s[i] != a && s[i] != b) {
                    i++;
               }
               Map<Integer, Integer> pos = new HashMap<>();
               pos.put(0, i - 1);
               int d = 0;
               while (i < n && (s[i] == a || s[i] == b)) {
                    d += (s[i] == a) ? 1 : -1;
                    Integer prev = pos.get(d);
                    if (prev != null) {
                         res = Math.max(res, i - prev);
                    } else {
                         pos.put(d, i);
                    }
                    i++;
               }
          }
          return res;
     }

     private int calc3(char[] s) {
          Map<Long, Integer> pos = new HashMap<>();
          pos.put(f(0, 0), -1);

          int[] cnt = new int[3];
          int res = 0;

          for (int i = 0; i < s.length; i++) {
               char c = s[i];
               ++cnt[c - 'a'];
               int x = cnt[0] - cnt[1];
               int y = cnt[1] - cnt[2];
               long k = f(x, y);

               Integer prev = pos.get(k);
               if (prev != null) {
                    res = Math.max(res, i - prev);
               } else {
                    pos.put(k, i);
               }
          }
          return res;
     }

     private long f(int x, int y) {
          return (x + 100000) << 20 | (y + 100000);
     }
}