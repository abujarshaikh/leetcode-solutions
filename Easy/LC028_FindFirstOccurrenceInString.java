// 1. Problem Summary

// Given two strings, haystack and needle, find the index of the first occurrence of needle in haystack.
// Return -1 if needle does not appear.

// 2. Approach Explanation

// Iterate through haystack and check for a substring match with needle starting at each index.

// If a match is found, return the current index.

// If no match exists by the end, return -1.

// Can also use built-in methods (indexOf) for a concise solution.

// 3. Time & Space Complexity

// Time Complexity: O(n * m) — n is length of haystack, m is length of needle

// Space Complexity: O(1) — only pointers and counters used


class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        int lengthHayStack=haystack.length();
        int lengthNeedle=needle.length();
        for(int i=0;i<=lengthHayStack-lengthNeedle;i++){
                if(haystack.substring(i,lengthNeedle+i).equals(needle)){
                    return i;
                }
        }
        return -1;
    }
}