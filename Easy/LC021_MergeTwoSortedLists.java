// 1. Problem Summary (GitHub-safe)

// Given the heads of two sorted linked lists, merge them into a single sorted linked list by splicing together the nodes of the original lists. Return the head of the merged list.

// 2. Approach Explanation

// Use a dummy node to simplify edge cases.

// Maintain a pointer current starting at the dummy.

// Compare nodes from both lists:

// Append the smaller node to current.next.

// Move the pointer in the list from which the node was taken.

// After one list is exhausted, append the remaining nodes from the other list.

// Return dummy.next as the head of the merged list.

// 3. Time & Space Complexity

// Time Complexity: O(n + m) — traverse both lists once (n and m are the lengths of the lists)

// Space Complexity: O(1) — only a few pointers used, no extra data structures


// Solution

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
import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ArrayList<Integer> result=new ArrayList<>();
        // if(list1 !=null){
        //     result.add(list1.val);
        //     list1=list1.next;
        // }
        // if(list2 !=null){
        //     result.add(list2.val);
        //     list2=list2.next;
        // }
        // Collections.sort(result);

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        // for(int val:result){
        //     curr.next=new ListNode(val);
        //     curr=curr.next;
        // }
        while(list1!=null && list2!= null){
            if(list1.val<=list2.val){
                curr.next=list1;
                list1=list1.next;
            }else{
                curr.next=list2;
                list2=list2.next;

            }
            curr=curr.next;
        }
        // if(list1!=null){
        //     curr.next=list1;
        // }else{
        //     curr.next=list2;
        // }
        curr.next=list1!=null?list1:list2;
        
        return dummy.next;
    }
}
