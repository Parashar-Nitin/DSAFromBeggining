class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy=prices[0], maxProfit=0;
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i]-bestBuy>maxProfit)
            {
                maxProfit=prices[i]-bestBuy;
            }
            if(bestBuy>prices[i])
            {
                bestBuy=prices[i];
            }
        }
        return maxProfit;
    }
}