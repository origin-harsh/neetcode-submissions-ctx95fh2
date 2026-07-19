class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int val:nums){
            count.put(val,count.getOrDefault(val,0)+1);
        }
        Map<Integer,Integer> OrderC = new LinkedHashMap<>();
      count.entrySet()
     .stream()
     .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
     .forEachOrdered(x -> OrderC.put(x.getKey(), x.getValue()));

        for(int i : OrderC.keySet()){
            res[res.length - (k--)] = i;
            if(k==0) break;
        }
        return res;

    }
}
