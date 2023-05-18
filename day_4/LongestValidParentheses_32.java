package day_4;

public class LongestValidParentheses_32 {
    // Problem Link: https://leetcode.com/problems/longest-valid-parentheses/
}

class Solution {
    public int longestValidParentheses(String s) {
        int maxValidLength = 0;
        int leftCount = 0;
        int rightCount = 0;
        
        // Scan from left to right
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                leftCount++;
            } else {
                rightCount++;
            }
            
            if (leftCount == rightCount) {
                maxValidLength = Math.max(maxValidLength, 2 * rightCount);
            } else if (rightCount > leftCount) {
                leftCount = rightCount = 0;
            }
        }
        
        leftCount = rightCount = 0;
        
        // Scan from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            
            if (c == ')') {
                rightCount++;
            } else {
                leftCount++;
            }
            
            if (leftCount == rightCount) {
                maxValidLength = Math.max(maxValidLength, 2 * leftCount);
            } else if (leftCount > rightCount) {
                leftCount = rightCount = 0;
            }
        }
        
        return maxValidLength;
    }
}

/*
 * Solution
 *  Time Complexity: O(n)
 *  Space Complexity: O(1)
 */