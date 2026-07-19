class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> sett = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            sett.add(nums[i]);
        }
        if(nums.length == sett.size()){
            return false;
        }
        return true;
    }
}