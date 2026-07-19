class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            int val =target - nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while(l <= r){
                int mid = l + (r-l)/2;
                if(nums[mid] == val){
                    return new int[]{i+1,mid+1};
                }
                else if(nums[mid] < val){
                    l = mid + 1;

                }else{
                    r = mid -1;
                }
            }
        }
        return new int[]{};
    }
}
