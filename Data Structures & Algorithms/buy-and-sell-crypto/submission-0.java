class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int ans = 0;

        for(int i = prices.length - 1 ; i >= 0 ; i--){
            int cans = max - prices[i];

            if(cans > 0){
                ans = Math.max(ans, cans);
            }

            max = Math.max(max, prices[i]);
        }
        
        return ans;
    }
}
