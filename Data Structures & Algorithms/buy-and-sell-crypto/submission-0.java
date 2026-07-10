class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
       for(int i=0;i<prices.length;i++){
        int profit = 0;
        for(int k=i+1;k<prices.length;k++) {
            profit = prices[k] - prices[i];
            maxProfit = Math.max(maxProfit, profit);
        }
       } 
       return maxProfit;
    }
}
