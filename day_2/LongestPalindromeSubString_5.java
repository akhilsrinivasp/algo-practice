package day_2;

// Problem Link: https://leetcode.com/problems/longest-palindromic-substring/

public class LongestPalindromeSubString_5 {
    public static void main(String[] args) {
        Solution_0 s = new Solution_0();
        System.out.println(s.longestPalindrome("babad"));
    }
}

class Solution_0 {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int maxLen = 0, start = 0, end = 0;
        for (int i = 0; i < n; i++) dp[i][i] = true;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) dp[i][i+1] = true;
            if (dp[i][i+1] && maxLen < 2) {
                maxLen = 2;
                start = i;
                end = i + 1;
            }
        }
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) {
                    dp[i][j] = true;
                    if (maxLen < len) {
                        maxLen = len;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }
}

class Solution_1 {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = 0, start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            int len1 = expandAroundCenter(s, n, i, i);
            int len2 = expandAroundCenter(s, n, i, i + 1);
            int len = Math.max(len1, len2);
            if (maxLen < len) {
                maxLen = len;
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int n, int l, int r) {
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) --l; ++r;
        return r - l - 1;
    }
}

class Solution_2 {
    public String longestPalindrome(String s) {
        String res = s.substring(0, 1);
        for(int i=0; i<s.length(); i++)
            for(int j=i; j<s.length(); j++) {
                if(s.substring(i, j+1).length()<res.length()) continue;
                // System.out.println(s.substring(i, j+1) + "\t" + res.length() + "\t" + (j-i));
                if(cP(s.substring(i, j+1)) && res.length()<(j-i+1)) res = s.substring(i, j+1);
            }
        return res;
    }
    private boolean cP(String s){
        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-(i+1))) return false;
        }
        return true;
    }
}

/*
 * Solution_0: Dynamic Programming
 *  Time Complexity: O(n^2)
 *  Space Complexity: O(n^2)
 * 
 * Solution_1: Expand Around Center
 *  Time Complexity: O(n^2)
 *  Space Complexity: O(1)
 * 
 * Solution_2: Brute Force
 *  Time Complexity: O(n^3)
 *  Space Complexity: O(1)
 */