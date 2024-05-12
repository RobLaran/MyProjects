package Leetcode.Easy;

// Given an integer x, return true if x is a 
// palindrome, and false otherwise.

// Example 1:
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

// Example 2:
// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

// Example 3:
// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

public class PalindromeNumber {
    public static void main(String[] args) {
    }

    public static boolean isPalindrome(int x){

        if (x == reverse(x)) {
            return true;
        } else {
            return false;
        }

    }

    public static int reverse(int num){
        int reversed = 0;
        int remainder = 0;
        int temp = num;

        while(temp > 0){
            remainder = temp % 10;
            reversed = reversed * 10 + remainder;  
            temp /= 10;
        }

        return reversed;
    }
}
