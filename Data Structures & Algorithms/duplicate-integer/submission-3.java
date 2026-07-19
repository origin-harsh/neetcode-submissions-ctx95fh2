class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int n:nums){
            st.add(n);
        }
        return st.size() == nums.length ? false : true;
    }
}