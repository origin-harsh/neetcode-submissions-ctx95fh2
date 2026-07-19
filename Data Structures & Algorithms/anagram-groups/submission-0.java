class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s: strs){
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            String sorS = new String(sArr);
            res.putIfAbsent(sorS, new ArrayList<>());
            res.get(sorS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
