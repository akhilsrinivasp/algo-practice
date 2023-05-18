package day_4;

public class BestTimeToBuyAndSellAStock_121 {
    // Problem Statement: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
}

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; // Initialize the maximum profit to 0
        int minPrice = Integer.MAX_VALUE; // Initialize the minimum price to the maximum possible value
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price if we encounter a lower price
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice; // Update the maximum profit if we find a larger difference
            }
        }
        
        return maxProfit; // Return the maximum profit
    }
}