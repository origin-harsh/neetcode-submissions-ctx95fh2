class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> data = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            data.add(nums[i]);
        }
        if(data.size() < nums.length) return true;
        else{
            return false;
        }
        
    }
}