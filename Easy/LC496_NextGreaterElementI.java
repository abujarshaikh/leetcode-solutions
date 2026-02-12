// Problem Summary 

// We are given two arrays where one array is a subset of the other.
// For each element in the first array, we must find the first greater number appearing to its right in the second array.

// If no greater number exists, return -1 for that element.

// Approach (Clear & Interview-Ready)
// Key Idea

// Instead of searching for the next greater element repeatedly, we precompute results for nums2 using a monotonic stack.

// Steps

// Traverse nums2.

// Use a stack to keep elements whose next greater element is not found yet.

// While current element is greater than stack top:

// Pop stack.

// Store mapping → popped element → current element.

// Push current element into stack.

// Remaining stack elements have no next greater → map them to -1.

// Build result for nums1 using the stored mapping.

// Time & Space Complexity

// Time Complexity: O(n + m)

// n = nums2 length

// m = nums1 length

// Space Complexity: O(n)

// Stack + HashMap storage

class Solution {
     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
          Map<Integer, Integer> map = new HashMap<>();
          Stack<Integer> stack = new Stack<>();

          // Process nums2 to find next greater element for each number
          for (int num : nums2) {
               while (!stack.isEmpty() && num > stack.peek()) {
                    map.put(stack.pop(), num);
               }
               stack.push(num);
          }

          // Remaining elements have no next greater element
          while (!stack.isEmpty()) {
               map.put(stack.pop(), -1);
          }

          // Build result for nums1
          int[] ans = new int[nums1.length];

          for (int i = 0; i < nums1.length; i++) {
               ans[i] = map.get(nums1[i]);
          }

          return ans;
     }
}