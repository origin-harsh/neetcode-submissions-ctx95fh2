 class Solution {
    public int largestRectangleArea(int[] height) {
        int n = height.length;
        int area = 0;

        for(int i = 0; i < n; i++){
            int minV = Integer.MAX_VALUE;

            for(int j = i; j < n; j++){
                minV = Math.min(minV, height[j]);

                int calc = minV * (j - i + 1);

                area = Math.max(area, calc);
            }
        }

        return area;
    }
}