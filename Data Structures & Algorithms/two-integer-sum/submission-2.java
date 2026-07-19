class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            int comp = target - nums[j];
            if(mp.containsKey(comp) && mp.get(comp) != j){
                return new int[] {j,mp.get(comp)};
            }
        }

        return new int[] {};
    }
}
