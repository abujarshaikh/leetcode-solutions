// Problem Summary 

// Given a sorted array of integers in ascending order, construct a height-balanced Binary Search Tree (BST) such that the in-order traversal of the tree matches the array.

// Approach Explanation

// A height-balanced BST is achieved by choosing the middle element of the array as the root.

// Recursively apply the same logic:

// Left half → left subtree

// Right half → right subtree

// This guarantees the BST property and keeps the tree balanced.

// Time & Space Complexity

// Time Complexity: O(n)
// Each element is used exactly once to create a tree node.

// Space Complexity: O(log n) (average case)
// Due to recursion stack for a balanced tree.
// (Worst case: O(n) recursion depth, but input guarantees balance.)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

class Solution {
     public TreeNode sortedArrayToBST(int[] nums) {
          return build(nums, 0, nums.length - 1);
     }

     private TreeNode build(int[] nums, int left, int right) {
          if (left > right)
               return null;

          int mid = left + (right - left) / 2;
          TreeNode root = new TreeNode(nums[mid]);

          root.left = build(nums, left, mid - 1);
          root.right = build(nums, mid + 1, right);

          return root;
     }

}