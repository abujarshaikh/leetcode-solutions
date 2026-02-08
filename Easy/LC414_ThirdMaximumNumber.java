// Problem Summary 

// Given an integer array, find the third distinct maximum value.
// If there are fewer than three distinct numbers, return the maximum value instead.
// Duplicate values should be counted only once when determining distinct maxima.

// Approach Explanation

// Use a min-heap (PriorityQueue) of size at most 3 to keep track of the top three distinct maximum values.

// Use a HashSet to avoid inserting duplicate numbers.

// Iterate through the array:

// Skip numbers already seen.

// Add numbers to the heap until it has 3 elements.

// Once full, replace the smallest element if a larger number is found.

// At the end:

// If fewer than 3 distinct values exist, return the maximum.

// Otherwise, return the third maximum (top of the min-heap).

// This ensures we process the array in a single pass while maintaining distinct values.

// Time and Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(1) (heap and set store at most 3 elements)


import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        // long x=Long.MIN_VALUE;
        // long y=Long.MIN_VALUE;
        // long z=Long.MIN_VALUE;

        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==x || nums[i]==y || nums[i]==z ){
        //         continue;
        //     }
        //     if(nums[i]>x){
        //         z=y;
        //         y=x;
        //         x=nums[i];
        //     }else if(nums[i]>y){
        //         z=y;
        //         y=nums[i];
        //     }else if(nums[i]>z){
        //         z=nums[i];
        //     }
        // }
        // if(z==Long.MIN_VALUE){
        //     return (int)x;
        // }
        // return (int)z;

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            if(pq.size()<3){
                pq.add(nums[i]);
                set.add(nums[i]);
            }else{
                if(nums[i]>pq.peek()){
                    set.remove(pq.poll());
                    pq.add(nums[i]);
                    set.add(nums[i]);
                }
            }
        }

        if(pq.size() !=2)return pq.peek();
        
        pq.poll();
        return pq.peek();

    }
}