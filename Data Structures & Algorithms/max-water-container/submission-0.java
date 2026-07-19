class Solution {
    public int maxArea(int[] height) {
        int ress = 0;
        for(int i=0;i<height.length;i++){
            for(int j = i+1;j<height.length;j++){
                int width = j-i;
                int ht = Math.min(height[i],height[j]);
                ress  = Math.max(ress,ht*width);
            }
        }
        return ress;
    }
}
