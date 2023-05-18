public class ReverseInteger_7 {
    // Problem Statement: https://leetcode.com/problems/reverse-integer/
}

class Solution_0 {
    public int reverse(int x) {
        int res = 0;
        while(x!=0) {
            if(res>Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && x%10>7)) return 0;
            if(res<Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && x%10<-8)) return 0;
            res = res*10 + (x%10);
            x = (int) x/10;
        }
        return res;
    }
}


class Solution_1 {
    public int reverse(int x) {
        int res = 0; 
        while(x!=0) {
            res = res*10 + (x%10);
            x = (int) x/10;
            if(res>Integer.MAX_VALUE/10 || res<Integer.MIN_VALUE/10) return 0;
        }
        return res;
    }
}

/*
 * Both Solutions follow same Time Complexity of O(log10(x))
 * But the second solution misses out on edge cases;
 */