package day_4;

public class SortColors_75 {
    // Problem Link: https://leetcode.com/problems/sort-colors/
}

class Solution_0 {
    public void sortColors(int[] nums) {
        int low=0, mid=0, high=nums.length-1;
        while(mid<=high) {
            if(nums[mid]==0) {
                swap(nums, low, mid);
                ++mid; ++low;
            }
            else if(nums[mid]==1) mid++;
            else {
                swap(nums, mid, high);
                --high;
            }
        }
    }
    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
}

/*
 * Solution_0
 *  Time Complexity: O(n)
 *  Space Complexity: O(1)
*/