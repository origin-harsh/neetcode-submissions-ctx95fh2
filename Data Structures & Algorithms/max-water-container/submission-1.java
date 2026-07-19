class Solution {
    public int maxArea(int[] height) {
        //optimal
        int i = 0;
        int j = height.length -1;
        int maxWater = 0;

        while(i<j){
            int ht = Math.min(height[i],height[j]);
            int width = j-i;
            maxWater = Math.max(maxWater,ht*width);
            if(ht == height[i]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;

        // int ress = 0;
        // for(int i=0;i<height.length;i++){
        //     for(int j = i+1;j<height.length;j++){
        //         int width = j-i;
        //         int ht = Math.min(height[i],height[j]);
        //         ress  = Math.max(ress,ht*width);
        //     }
        // }
        // return ress;
    }
}
