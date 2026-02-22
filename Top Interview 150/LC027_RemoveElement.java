// 1. Problem Summary

// Given an integer array and a value val, remove all occurrences of val in-place and return the number of elements that are not equal to val.
// The first k elements of the array should contain the remaining elements; the order of elements can be changed.

// 2. Approach Explanation

// Use a two-pointer approach:

// i tracks the position to place the next non-val element.

// j iterates through the array.

// For each nums[j] != val, assign nums[i] = nums[j] and increment i.

// After traversing the array, i represents the count of elements not equal to val.

// 3. Time & Space Complexity

// Time Complexity: O(n) — single pass through the array

// Space Complexity: O(1) — modifies array in-place, no extra storage

class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int[] a=new int[count];
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                nums[count]=nums[i];
                count ++;
            }
        }
        return count;
    }
}