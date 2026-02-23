// ✅ Problem Summary (In My Own Words)

// Given a binary string s and an integer k, determine whether all possible binary combinations of length k appear as substrings in s.

// Since there are exactly 2^k possible binary codes of size k, return:

// true → if all 2^k patterns exist in s

// false → otherwise

// 💡 Key Insight

// Total possible binary strings of length k = 2^k

// We slide a window of size k over s

// Store each substring in a HashSet

// If set size becomes 2^k, return true

// Also:
// If s.length() < 2^k + k - 1, it’s impossible to contain all codes → early return false

// 🚀 Approach

// If k > s.length() → return false

// Create a HashSet<String>

// Slide window from 0 to s.length() - k

// Add substring of size k

// If set size == 1 << k, return true

// Otherwise return false

// ⏱ Time & Space Complexity

// Time: O(n * k)
// (Substring creation costs O(k))

// Space: O(2^k)

// Since k ≤ 20, 2^k is manageable.


class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k)return false;

        int req=1<<k;
        Set<String> set=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            set.add(s.substring(i,i+k));
            if(set.size()==req)return true;
        }
        return false;
    }
}