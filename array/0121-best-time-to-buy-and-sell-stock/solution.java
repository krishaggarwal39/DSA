class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = prices[prices.length - 1];
        int max = 0;
        while ( buy < sell){
            int profit ;
            profit = sell-buy;
            if ( profit > max){
                max = profit;
            }
        }
        return max;
    }