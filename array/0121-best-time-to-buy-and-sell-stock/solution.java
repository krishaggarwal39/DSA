class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        for ( int i = 0 ; i < prices.length ; i++){
            int profit;
            for ( int j = i+1 ; j < prices.length ; j++){
                profit = prices[j] - prices[i];
            }
        }
                if ( profit > max_profit ){
                    max_profit = profit;
                }
    }
        return max_profit;