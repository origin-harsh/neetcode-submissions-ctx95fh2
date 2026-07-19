class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] Output = new int[nums.length];
       
        for(int i=0;i<nums.length;i++){
            int data = 1;
            for(int j=0;j<nums.length;j++){
            if(i!=j){
                data *= nums[j];
                }
              
            }
            Output[i] = data;
        }
        
        return Output;
    }
}  
