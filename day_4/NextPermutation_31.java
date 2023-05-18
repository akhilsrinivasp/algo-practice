package day_4;

public class NextPermutation_31 {
    // Problem Link: https://leetcode.com/problems/next-permutation/
}

class Solution_0 {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n=nums.length;
        for(int i=n-2; i>=0; i--) {
            if(nums[i]<nums[i+1]) {
                index = i;
                break;
            }
        } 
        if(index==-1){
            reverse(nums,0,n);
            return;
        }
        for(int i=nums.length-1; i>index; i--) {
            if(nums[i]>nums[index]) {
                int tmp = nums[i]; 
                nums[i]=nums[index]; 
                nums[index]=tmp;
                break;
            }
        }
        reverse(nums, index+1, n);
    }
    private void reverse(int[] arr, int s, int e) {
        int tmp;
        for (int i = s; i < (s + e) / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[e - (i - s) - 1]; // e - (i - s) - 1 is the index of the element to be swapped with arr[i]
            arr[e - (i - s) - 1] = tmp; // (i-s) is here as we are not starting from 0th index
        }
    }
}

/*
 * Solution_0
 *  Time Complexity: O(n)
 *  Space Complexity: O(1)
 */