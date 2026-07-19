class Solution {
    public int findMin(int[] nums) {
        int size = nums.length;
        int n = nums[0];
        for(int i=0;i<size;i++){
            if(nums[i]<n){
                n = nums[i];
            }

        }
        return n;
    }
}
