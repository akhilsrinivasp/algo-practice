package day_5;

public class RotateImage_48 {
    // Problem: https://leetcode.com/problems/rotate-image/
}

class Solution {
    public void rotate(int[][] m) {
        int n = m.length, temp;
        for(int i=0; i<n; i++) 
            for(int j=i+1; j<n; j++) {
                temp = m[i][j]; 
                m[i][j]=m[j][i]; 
                m[j][i]=temp;
            }
        for(int i=0; i<n; i++) {
            int p=0, q=n-1;
            while(p<q) {
                temp=m[i][p]; 
                m[i][p]=m[i][q]; 
                m[i][q]=temp;
                ++p; --q;
            }
        }
    }
    private void printMatrix(int[][] m) {
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<m[i].length; j++) 
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}

class Solution_0 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { // j = i because we don't want to swap the same elements twice
                int temp = matrix[j][i]; // Transpose
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        // Reverse
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = matrix[i][start]; // Reverse
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}

class Solution_1 {
    public int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[matrix.length][matrix.length];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                temp[j][n - 1 - i] = matrix[i][j];
            }
        }
        return temp;
    }
}

/*
 * Complexity Analysis
 * Solution_0
 * Time complexity: O(N^2) because we are iterating through the matrix twice
 * Space complexity: O(1) because we are not creating a new matrix
 * 
 * Solution_1
 * Time complexity: O(N^2) because we are iterating through the matrix once
 * Space complexity: O(N^2) because we are creating a new matrix
 */