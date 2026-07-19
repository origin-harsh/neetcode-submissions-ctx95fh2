class Solution {
    public int trap(int[] height) {
        int n = height.length;
        // int[] lMax = new int[n];
        // int[] rMax = new int[n];
        // int ans =0;
        // lMax[0] = height[0];
        // rMax[n-1] = height[n-1];
        // for(int i=1;i<n;i++){
        //     lMax[i] = Math.max(lMax[i-1],height[i]);
        // }
        // for(int i=n-2;i>=0;i--){
        //     rMax[i] = Math.max(rMax[i+1],height[i]);
        // }
        // for(int i=0;i<n;i++){
        //     ans += Math.min(lMax[i],rMax[i])-height[i];
        // }

        // return ans;
        int l = 0;
        int r  = n-1;
        int lMax = 0;
        int rMax = 0;
        int ans  = 0;

        while(l < r){
            lMax = Math.max(lMax,height[l]);
            rMax = Math.max(rMax,height[r]);
            if(lMax<rMax){
                ans += lMax-height[l];
                l++;
            }
            else{
                ans += rMax-height[r];
                r--;

            }
            
            
        }
        

        return ans;

    }
}
