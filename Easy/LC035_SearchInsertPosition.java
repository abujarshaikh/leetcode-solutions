// 1. Problem Summary (GitHub-safe)

// Given a sorted array of distinct integers, return the index of a target value if it exists.
// If the target is not in the array, return the index where it would be inserted to maintain sorted order. The solution must run in O(log n) time.

// 2. Approach Explanation

// Use binary search on the sorted array:

// Maintain low and high pointers.

// Compute mid = low + (high - low) / 2.

// If nums[mid] == target, return mid.

// If nums[mid] < target, move low = mid + 1.

// If nums[mid] > target, move high = mid - 1.

// If not found, low will point to the correct insertion index.

// 3. Time & Space Complexity

// Time Complexity: O(log n) — binary search

// Space Complexity: O(1) — constant extra space


class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target || nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}