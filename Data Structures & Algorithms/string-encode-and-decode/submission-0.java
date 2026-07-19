class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        for(String s: strs){
            res.append(s.length()).append("#").append(s);
        }
        return res.toString();

    }

    public List<String> decode(String str) {

        if(str.length()==0) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int pos = str.indexOf("#",i);
            String len = str.substring(i,pos);
            i = pos + 1;
            int length = Integer.parseInt(len);
            String s = str.substring(i,i+length);
            res.add(s);
            i = i + length;  

        } 

       return res; 
    }
}
