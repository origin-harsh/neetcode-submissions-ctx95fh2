class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            int width = right - left;
            int currh = Math.min(height[left],height[right]);
            int currArea = width * currh;

            maxArea = Math.max(maxArea,currArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
