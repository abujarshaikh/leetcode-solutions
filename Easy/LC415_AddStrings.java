// Problem Summary 

// Add two non-negative numbers given as strings and return their sum as a string. The solution must simulate manual addition without converting the strings to numeric types or using big-number libraries.

// Approach

// Start from the end of both strings (least significant digits).

// Add corresponding digits along with a carry.

// Append the current digit (sum % 10) to a StringBuilder.

// Update carry (sum / 10) and move left.

// Continue until all digits and carry are processed.

// Reverse the result to get the correct order.

// Time & Space Complexity

// Time Complexity: O(max(n, m))

// Space Complexity: O(max(n, m)) for the result string

class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;

        int carry=0;
        StringBuilder s=new StringBuilder();
        // String s="";

        while(i>=0||j>=0|| carry >0){
            int digit1=i>=0? num1.charAt(i)-'0':0;
            int digit2=j>=0? num2.charAt(j)-'0':0;

            int sum=digit1+digit2+carry;

            carry=sum/10;

            // s=(sum%10)+s;
            s.append(sum%10);

            i--;
            j--;
        }
        // return s;
        return s.reverse().toString();
    }
}