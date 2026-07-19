class Solution {
    public String longestCommonPrefix(String[] strs) {
    String first = strs[0];
    int firstLen = first.length();
    for(int i =1;i<strs.length;i++){
        String s = strs[i];
        while(firstLen>s.length() || !first.equals(s.substring(0,firstLen))){
            firstLen--;
            if(firstLen == 0){
                return "";
            }
            first = first.substring(0,firstLen);
        }
    }


   return first;    
    }
}