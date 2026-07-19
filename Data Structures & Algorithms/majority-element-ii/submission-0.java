class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int k = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int n: nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
       for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        if (entry.getValue() > (k / 3)) {
            res.add(entry.getKey());
        }
    }

        return res;
    }
}