// 1. Problem Summary

// Given the head of a sorted singly linked list, remove duplicate values so that each value appears only once.
// The list should remain sorted, and the operation must be done in place by adjusting node links.

// 2. Approach Explanation

// Start from the head of the list.

// Traverse the list using a pointer (current).

// If the current node’s value is the same as the next node’s value:

// Skip the next node by updating current.next.

// Otherwise, move current forward.

// Continue until the end of the list.

// This works efficiently because the list is already sorted, so duplicates are always adjacent.

// 3. Time & Space Complexity

// Time Complexity: O(n) — each node is visited once

// Space Complexity: O(1) — no extra data structures used

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current=head;

        while(current!=null && current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
        
    }
}