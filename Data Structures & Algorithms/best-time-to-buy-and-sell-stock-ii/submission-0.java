class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        for(int j =1;j<prices.length;j++){
            if(prices[j-1] < prices[j]) profit += prices[j] - prices[j-1];
            
            
        }
        return profit;
    }
}