class Solution {
    public int largestRectangleArea(int[] height) {
        int n = height.length;
        int calc = 0;
        int area = 0;
        int minV = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j = i;j<n;j++){
                int maiV = Math.min(height[i],height[j]);
                minV = Math.min(minV,maiV);
                calc = minV*(j-i+1);
                area = Math.max(area,calc);
            }
            minV = Integer.MAX_VALUE;
        }
        return area;
    }
}
