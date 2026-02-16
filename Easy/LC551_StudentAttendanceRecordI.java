// Problem Summary 

// We are given a string representing a student’s attendance record, where:

// 'A' → Absent

// 'L' → Late

// 'P' → Present

// The student qualifies for an award only if:

// They have fewer than 2 absences total, and

// They never have 3 or more consecutive late days.

// We must return true if both conditions are satisfied; otherwise, return false.

// Approach Explanation

// Initialize two counters:

// absent → tracks total 'A'

// late → tracks consecutive 'L'

// Traverse the string character by character:

// If 'A' → increment absent, reset late

// If absent >= 2, return false

// If 'L' → increment late

// If late >= 3, return false

// If 'P' → reset late

// If traversal completes without violations, return true

// ✔️ Single pass
// ✔️ Constant extra space
// ✔️ Early exit optimization

// Time & Space Complexity

// Time Complexity: O(n) — single traversal of the string

// Space Complexity: O(1) — only counters used

class Solution {
     public boolean checkRecord(String s) {
          int absent = 0;
          int late = 0;
          for (char c : s.toCharArray()) {
               if (c == 'A') {
                    absent++;
                    if (absent >= 2) {
                         return false;
                    }
                    late = 0;
               } else if (c == 'L') {
                    late++;
                    if (late >= 3) {
                         return false;
                    }
               } else {
                    late = 0;
               }
          }
          return true;
     }
}


