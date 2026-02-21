// ✅ Problem Summary (GitHub-safe)

// Given two integers left and right, count how many numbers in this inclusive range have a prime number of set bits (1s) in their binary representation.

// 💡 Approach

// Iterate from left to right.

// For each number:

// Use Integer.bitCount(i) to count the number of 1s in its binary form.

// Check if the count of set bits is a prime number.

// If prime, increment the result counter.

// Return the final count.

// Using Integer.bitCount() avoids manual binary conversion and makes the solution clean and efficient.

// ⏱ Time & Space Complexity

// Time Complexity:
// O(n * √k)

// n = right - left + 1

// k = number of bits (max ~32)
// Prime check runs up to √k.

// Space Complexity:
// O(1) (constant extra space)

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        for(int i=left;i<=right;i++){
            // int count=0;
            // String binary=Integer.toBinaryString(i);
            // for(int j=0;j<binary.length();j++){
            //     if(Integer.parseInt(String.valueOf(binary.charAt(j)))==1){
            //         count++;
            //     }
            // }
            int setBits=Integer.bitCount(i);
            if(isPrime(setBits)){
                res++;
            }
        }
        return res;
    }
    public boolean isPrime(int n){
        if(n<2)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}