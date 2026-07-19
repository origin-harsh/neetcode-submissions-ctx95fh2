class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        int ch;
        int n = nums.size();
        for(int i=0;i<n;i++){
            ch = nums[i];
            for(int j=i+1;j<n;j++){
                if(ch==nums[j]){
                     return true;
                }
            }
        }
        return false;
    }
};