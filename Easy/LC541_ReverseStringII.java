// Problem Summary 

// In 541. Reverse String II, we are given a string s and an integer k.
// Starting from the beginning of the string, for every block of 2k characters:

// Reverse the first k characters.

// Leave the next k characters unchanged.

// If fewer than k characters remain → reverse all of them.

// If between k and 2k characters remain → reverse only the first k.

// Return the modified string.

// Approach Explanation

// Convert the string into a character array for easy in-place modification.

// Iterate through the array in steps of 2k.

// For each step:

// Reverse characters from index i to min(i + k - 1, n - 1).

// Continue until the entire string is processed.

// Convert the modified character array back to a string.

// We use a helper method to reverse characters within a given range.

// Time & Space Complexity

// Time Complexity: O(n)
// Each character is visited at most once.

// Space Complexity: O(n)
// Due to conversion to a character array.

class Solution {
    public void reverse(char[] arr, int i,int j) {
        while(i<=j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }

    }
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int i=0;
        int n=s.length();
        while(i<n){
            int j=Math.min(i+k-1,n-1);
            reverse(arr,i,j);
            i+=2*k;
        }
        return new String(arr);
    }
}