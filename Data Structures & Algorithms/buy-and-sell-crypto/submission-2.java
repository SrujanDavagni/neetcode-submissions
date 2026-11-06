class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int left = 0;
        for(int right = 0; right < n; right++){
            int curVal = prices[right] - prices[left];
            profit = Math.max(profit, curVal);
            while(prices[right] < prices[left]){
                left++;
            }
        }
        return profit;
    }
}
