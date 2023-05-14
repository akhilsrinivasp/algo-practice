import java.util.HashMap;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LongestSubstringWithoutRepeatingCharacters_3 {
    
}

// Time Optimized:
class Solution_0 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int i =0; 
        int j =0;
        int m =1;
        HashMap<Character, Integer> mp = new HashMap<>();
        while(j<s.length()) {
            if(mp.containsKey(s.charAt(j))) i = Math.max(mp.get(s.charAt(j)),i);
            m = Math.max(m, j-i+1);
            mp.put(s.charAt(j), j+1);
            ++j;
        }
        return m;
    }
}

// Memory Optimized:
class Solution_1 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int i =0; 
        int j =1;
        int m =1;
        while(i<s.length() && j<s.length()) {
            for(int k = i; k<j; k++) {
                if(s.charAt(j)==s.charAt(k)) 
                    i = k+1;
            }
            m = Math.max(m, j-i+1);
            ++j;
        }
        return m;
    }
}

/*
 * Solution_0:
 *  Time complexity : O(n). Index j will iterate n times.
 *  Space complexity (HashMap) : O(min(m,n)). Same as the previous approach.
 *  Space complexity (Table): O(m). m is the size of the charset.
 * 
 * Solution_1:
 *  Time complexity : O(n^2). Index j will iterate n times.
 *  Space complexity (Table): O(m). m is the size of the charset.
 */