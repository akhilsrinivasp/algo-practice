// https://leetcode.com/problems/set-matrix-zeroes/description/

public class SetMatrixZeroes_73 {
    
}

class Solution_0 {
    public void setZeroes(int[][] m) {
        for(int i = 0; i<m.length; i++)
            for(int j=0; j<m[i].length; j++) 
                if(m[i][j]==0) markRC(m,i,m.length,j,m[i].length);
        markZero(m);
    }
    private void markRC(int[][] m, int i, int p, int j, int q) {
        for (int k=0; k<p; k++) 
            if(m[k][j]!=0) m[k][j]=-11; 
        for (int k=0; k<q; k++) 
            if(m[i][k]!=0) m[i][k]=-11;
    }
    private void markZero(int[][] m) {
        for(int i = 0; i<m.length; i++)
            for(int j=0; j<m[i].length; j++) 
                if(m[i][j]==-11) m[i][j]=0;
    }
}

class Solution_1 {
    public void setZeroes(int[][] m) {
        boolean fc=true;
        for(int i = 0; i<m.length; i++)
            for(int j=0; j<m[0].length; j++) 
                if(m[i][j]==0) {
                    m[i][0]=0;
                    if(j==0) fc=false;
                    else m[0][j]=0;
                }
        for(int i = 1; i<m.length; i++)
            for(int j=1; j<m[0].length; j++) 
                if(m[i][j]!=0)
                if(m[i][0]==0 || m[0][j]==0) 
                    m[i][j]=0;
        if(m[0][0]==0) for (int i=0; i<m[0].length; i++) m[0][i]=0;
        if(!fc) for(int i=0; i<m.length; i++) m[i][0]=0;
    }
}

/*
 * Solution_0:
 *  Time complexity : O(m*n*(m+n)). We traverse the matrix of size m*n twice.
 *  Space complexity : O(1).
 * 
 * Solution_1:
 *  Time complexity : O(m*n). We traverse the matrix of size m*n twice.
 *  Space complexity : O(1).
 */