package day_4;

public class MaximumSubArray_53 {
    // Problem Link: https://leetcode.com/problems/maximum-subarray/
}

class Solution_0 {
    public int maxSubArray(int[] nums) {
        int curr_max=0, res=Integer.MIN_VALUE;
        for(int num:nums) {
            curr_max=Math.max(num, curr_max+num);
            res=Math.max(res, curr_max);
        }
        return res;
    }
}

class Solution_1 {
    public int maxSubArray(int[] nums) {
        int curr = 0, max = Integer.MIN_VALUE;
        for (int num : nums) {
            curr += num;
            max = Math.max(max, curr);
            if (curr < 0)
                curr = 0;
        }
        return (max<0)?max:0;
    }
}