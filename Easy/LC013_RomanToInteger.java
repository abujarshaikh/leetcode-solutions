// 1. Problem Summary

// Given a string representing a Roman numeral, convert it into its corresponding integer value by applying standard Roman numeral rules, including subtraction cases.

// Approach Explanation

// Map each Roman symbol to its integer value.

// Traverse the string from left to right.

// If the current symbol’s value is less than the next symbol’s value, subtract it from the total.

// Otherwise, add it to the total.

// This handles both normal and subtractive Roman numeral cases efficiently.

// Time & Space Complexity

// Time Complexity: O(n) — where n is the length of the Roman numeral string

// Space Complexity: O(1) — fixed mapping of Roman symbols

// Solution

import java.util.*;
class Solution {
   public static int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int num=map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                num= num-map.get(s.charAt(i));
            }else{
                num= num+ map.get(s.charAt(i));
            }
        }
        return num;
    }
     
}