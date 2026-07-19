class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i] + nums[j] + nums[k]==0){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        

                    }
                
                }
            }
        }
        
       

        for (List<Integer> list : res) {
        Collections.sort(list);
        }
        Set<List<Integer>> finall = new HashSet<>(res);
        List<List<Integer>> result = new ArrayList<>(finall);


        return result;
    }
}
