
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            int comp = target - nums[j];
            if(map.containsKey(comp) && map.get(comp)!=j){
                return new int[] {j,map.get(comp)};
            }
        }
        return new int[] {};
    }
}
