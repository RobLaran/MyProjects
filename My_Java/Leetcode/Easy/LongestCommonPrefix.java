package Leetcode.Easy;

import java.util.Arrays;

/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters. */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        int endPoint = 0;

        Arrays.sort(strs);

        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];

        while (endPoint < firstStr.length() && endPoint < lastStr.length()) {
            if(firstStr.charAt(endPoint) == lastStr.charAt(endPoint)){
                endPoint++;
            } else {
                break;
            }
        }

        return firstStr.substring(0, endPoint);

    }
}
