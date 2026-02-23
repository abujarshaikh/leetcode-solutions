// 1. Problem Summary

// Given a sorted integer array, remove duplicates in-place so that each unique element appears only once. Return the number of unique elements k and ensure the first k elements contain the sorted unique values.

// 2. Approach Explanation

// Use two pointers:

// i tracks the position of the last unique element.

// j scans the array.

// When nums[j] != nums[i], increment i and update nums[i] = nums[j].

// Continue until the end of the array.

// Return i + 1 as the count of unique elements.

// 3. Time & Space Complexity

// Time Complexity: O(n) — single pass through the array

// Space Complexity: O(1) — in-place, no extra storage needed


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }
        return k+1;
    }
}