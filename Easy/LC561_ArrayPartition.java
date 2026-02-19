// ✅ Problem Summary (In My Own Words)

// We are given an array containing 2n integers.
// We must divide them into n pairs such that the sum of the smaller element in each pair is as large as possible.

// Our goal is to return this maximum possible sum.

// 💡 Approach

// To maximize the sum of minimums:

// Sort the array in ascending order.

// After sorting, pair adjacent elements:

// (nums[0], nums[1])

// (nums[2], nums[3])

// (nums[4], nums[5])

// Add elements at even indices (0, 2, 4, ...) to the result.

// Why This Works?

// Sorting ensures:

// Smaller numbers are grouped together.

// This prevents large numbers from being "wasted" as minimums in inefficient pairings.

// Taking every alternate element after sorting gives the optimal sum.

// ⏱ Time & Space Complexity

// Time Complexity: O(n log n) (due to sorting)

// Space Complexity:

// O(1) (if sorting in-place)

// O(log n) (depending on sorting implementation stack space)

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}