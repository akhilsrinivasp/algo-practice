public class ZigZagConversion_6 {
    
}

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder res = new StringBuilder();
        int n = s.length();
        int char_per_block = 2*numRows-2;
        
        for(int curr_row = 0; curr_row<numRows; curr_row++) {
            int index = curr_row; 
            while(index<n) {
                res.append(s.charAt(index));
                if(curr_row!=0 && curr_row!=numRows-1) {
                    int second_index = index + char_per_block - (2 * curr_row);
                    if (second_index<n) res.append(s.charAt(second_index));
                }
                index+=char_per_block;
            }
        }
        return res.toString();
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)