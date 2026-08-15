class Solution {
    public int maxProfit(int[] prices) {
        int cur=prices[0];

        int prof=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]-cur>0){
                prof+=(prices[i]-cur);
            }
            
                cur=prices[i];
            
        }
        return prof;
    }
}