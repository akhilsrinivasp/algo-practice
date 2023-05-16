import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {
    // Problem Link: https://leetcode.com/problems/pascals-triangle/
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int n = numRows;
        List<Integer> firstEle = new ArrayList<>();
        firstEle.add(1);
        res.add(firstEle);
        System.gc();
        for(int i = 2; i<=n; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<i; j++) {
                List<Integer> prev = res.get(res.size()-1);
                int i1 = j-1;
                int i2 = j;
                // System.out.println(i1 + " " + i2 + " " + (i2==prev.size()));
                if(j==0) temp.add(prev.get(j));
                else if(i2>=prev.size()) temp.add(prev.get(i1));
                else temp.add(prev.get(i1)+prev.get(i2));
            }
            res.add(temp);
        }
        return res;
    }
}