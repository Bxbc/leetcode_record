package leetcode;

class best_time_to_buy_and_sell_stock_DP {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int minprice = prices[0];
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-minprice>maxprofit){
                maxprofit = prices[i]-minprice;
            }
            if(prices[i]<minprice){
                minprice = prices[i];
            }
        }
        return maxprofit;
    }
}
