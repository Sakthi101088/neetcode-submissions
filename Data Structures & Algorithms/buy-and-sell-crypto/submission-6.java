class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(minPrice>prices[i])
                minPrice=prices[i];
            profit = Math.max(profit,prices[i]-minPrice);
        }
        return profit;
    }
}








// int profit=0;
//         int minPrice = Integer.MAX_VALUE;
//         for(int i =0;i<prices.length;i++){
//             if(minPrice>prices[i])
//                 minPrice=prices[i];
            
//             else if((prices[i]-minPrice) > profit)
//                 profit = prices[i]-minPrice;
//         }
//         return profit;