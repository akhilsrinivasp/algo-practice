#include<bits/stdc++.h>
using namespace std;

int main() {
    // Problem Statement: https://leetcode.com/problems/merge-sorted-array/
}

class Solution_0 {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for(int i=m, j=0; j<n; j++, i++) {
            nums1[i]=nums2[j];
        }
        sort(nums1.begin(), nums1.end());
    }
};

/*
    Time Complexity :- O(nlogn)
    Space Complexity :- O(1)
*/

class Solution_1 {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i=m-1, j=n-1;
        
        for(int k=m+n-1; k>=0; k--) {
            if(j<0) {
                break;
            }
            if(i>=0 && nums1[i]>nums2[j]) {
                nums1[k]=nums1[i];
                i--;
            }
            else {
                nums1[k]=nums2[j];
                j--;
            }
        }
    }
};

/*
    Time Complexity :- O(n)
    Space Complexity :- O(1)
*/

class Solution_2 {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        //if(m == 0 && n != 0)
       // nums1.swap(nums2);

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[k--] = nums1[i--];
            }
            else
            {
                nums1[k--] = nums2[j--];
            }
        }
        while(i >= 0)
        {
            nums1[k--] = nums1[i--];
        }
        while(j >= 0)
        {
            nums1[k--] = nums2[j--];
        }

    }
};

/*
    Time Complexity :- O(n)
    Space Complexity :- O(1)
*/