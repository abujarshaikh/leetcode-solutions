// Problem Summary 

// Given the root of a binary search tree, rebuild the tree so that it becomes height-balanced while preserving all original node values and BST ordering.

// Approach Explanation

// Perform an inorder traversal of the BST to collect node values in sorted order.

// Reconstruct a balanced BST from the sorted list by recursively choosing the middle element as the root.

// Build left and right subtrees from the left and right halves of the list.

// This guarantees the height difference between subtrees stays within 1.

// Time and Space Complexity

// Time Complexity: O(n)

// Space Complexity: O(n) (inorder list + recursion stack)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
     public TreeNode balanceBST(TreeNode root) {
          List<Integer> list = new ArrayList<>();
          traversal(root, list);
          return createBalancedBST(list, 0, list.size() - 1);

     }

     private void traversal(TreeNode node, List<Integer> list) {
          if (node == null) {
               return;
          }

          traversal(node.left, list);
          list.add(node.val);
          traversal(node.right, list);
     }

     private TreeNode createBalancedBST(List<Integer> list, int left, int right) {
          if (left > right) {
               return null;
          }

          int mid = left + (right - left) / 2;
          TreeNode root = new TreeNode(list.get(mid));
          root.left = (createBalancedBST(list, left, mid - 1));
          root.right = (createBalancedBST(list, mid + 1, right));

          return root;
     }
}