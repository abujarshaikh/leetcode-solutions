// 1. Problem Summary (GitHub-safe)

// Given a string containing words and spaces, return the length of the last word.
// A word is defined as a maximal substring of non-space characters.

// 2. Approach Explanation

// Trim trailing spaces from the string.

// Iterate backwards from the end of the string until a space is found.

// Count the number of characters traversed — this is the length of the last word.

// Alternatively, split the string by spaces and return the length of the last non-empty element.

// 3. Time & Space Complexity

// Time Complexity: O(n) — traverse the string once

// Space Complexity: O(1) for the backward iteration approach (O(n) if using split)