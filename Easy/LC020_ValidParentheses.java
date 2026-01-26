// 1. Problem Summary

// Given a string containing only ()[]{}, check if it is valid.
// A string is valid if every opening bracket has a corresponding closing bracket of the same type and the brackets are closed in the correct order.

// 2. Approach Explanation

// Use a stack to track opening brackets.

// Traverse the string:

// If it’s an opening bracket, push it onto the stack.

// If it’s a closing bracket, check if it matches the top of the stack.

// If it matches, pop the stack.

// Otherwise, return false.

// After traversal, the stack should be empty for a valid string.

// 3. Time & Space Complexity

// Time Complexity: O(n) — one pass through the string

// Space Complexity: O(n) — stack may store all opening brackets


// Solution
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        // while(true){
        //     if(s.contains("()")){
        //         s=s.replace("()","");
        //     }
        //     else if(s.contains("[]")){
        //         s=s.replace("[]","");
        //     }
        //     else if(s.contains("{}")){
        //         s=s.replace("{}","");
        //     }else{
        //         return s.isEmpty();
        //     }
        // }
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }
        return stack.isEmpty();
    }
}