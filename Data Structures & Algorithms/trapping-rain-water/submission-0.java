class Solution {
    public int trap(int[] height) {
        
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];

        prefix[0] = -1;
        suffix[height.length - 1] = -1;

        int lmax = height[0];
        int rmax = height[height.length - 1];

        for(int i = 1 ; i < height.length ; i++){
            prefix[i] = lmax;
            lmax = Math.max(lmax, height[i]);
        }

        for(int i = height.length - 2 ; i >= 0 ; i--){
            suffix[i] = rmax;
            rmax = Math.max(rmax, height[i]);
        }

        int ans = 0;

        for(int i = 1 ; i < height.length - 1 ; i++){
            int cans = Math.min(prefix[i], suffix[i]) - height[i];

            if(cans > 0){
                ans += cans;
            }
        }

        return ans;
    }
}
