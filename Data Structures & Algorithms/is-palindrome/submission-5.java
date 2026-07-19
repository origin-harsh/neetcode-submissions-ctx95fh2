class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder res = new StringBuilder(s);
        if(s.equals(res.reverse().toString())) return true;
        return false;
        
    }
}
