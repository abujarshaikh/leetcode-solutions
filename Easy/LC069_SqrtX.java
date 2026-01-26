// 1. Problem Summary 

// Given a non-negative integer x, compute and return the integer part of its square root.
// The result must be the largest integer y such that y * y ≤ x, without using built-in power or square root functions.

// 2. Approach Explanation

// Use binary search over the range 0 to x.

// At each step, calculate mid and compare mid * mid with x.

// If mid * mid == x, return mid.

// If mid * mid < x, store mid as a potential answer and move right.

// If mid * mid > x, move left.

// The stored value represents the floor of the square root.

// Use long for multiplication to avoid overflow.

// 3. Time & Space Complexity

// Time Complexity: O(log x) — binary search

// Space Complexity: O(1) — constant extra space


class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
        if(x==0 || x<0){
            return 0;
        }
        long max=x/2+1;
        long min=1;
        while(max-min !=1){
            long mid= (max+min)/2;
            if(mid*mid>x){
                max=mid;
            }else{
                min=mid;
            }
        }
        return (int)min;

    }
}