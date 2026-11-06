class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int left = n - 1;
        for(int right = n - 1; right >= 0; right--){
            int curVal = prices[left] - prices[right];
            profit = Math.max(profit, curVal);
            while(prices[left] < prices[right]){
                left--;
            }
        }
        return profit;
    }
}
