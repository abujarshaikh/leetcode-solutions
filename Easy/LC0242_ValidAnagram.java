// 1. Problem Summary 

// Given two strings, determine whether one string can be formed by rearranging the characters of the other. If both strings contain the same characters with the same frequencies, return true; otherwise, return false.

// 2. Approach

// If the lengths of the two strings are different, they cannot be anagrams.

// Use a frequency array of size 26 (for lowercase English letters).

// Increment the count for each character in the first string.

// Decrement the count for each character in the second string.

// If all values in the frequency array are zero, the strings are anagrams.

// 3. Time and Space Complexity

// Time Complexity: O(n)
// (Single pass through both strings)

// Space Complexity: O(1)
// (Fixed-size array of 26 characters)class Solution {
class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length()){
        //     return false;
        // }
        int s1[]=new int[26];
        int t1[]=new int[26];

        for(char c:s.toCharArray()) s1[c-'a']++;
        for(char c:t.toCharArray()) t1[c-'a']++;


        // Arrays.sort(s1);
        // Arrays.sort(t1);

        return Arrays.equals(s1,t1);
    }
}
