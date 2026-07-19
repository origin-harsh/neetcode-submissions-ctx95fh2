class Solution {
    public int subarraySum(int[] nums, int k) {
      
  
        int count = 0;
        int currSum = 0;
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<n;i++){
            currSum += nums[i];
            count += mp.getOrDefault((currSum - k),0);
            mp.put(currSum, mp.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}