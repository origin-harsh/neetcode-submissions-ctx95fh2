class Solution {
    public boolean validPalindrome(String s) {
       if(isPalindrome(s)) return true;
        for(int i=0;i<s.length();i++){
            String ch = s.substring(0,i) + s.substring(i+1);
            if(isPalindrome(ch)) return true;
        }
        return false;
    }
    private boolean isPalindrome(String st){
        st = st.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder res = new StringBuilder(st);
        if(st.equals(res.reverse().toString())){
                return true;
            }
        return false;
    }
}
