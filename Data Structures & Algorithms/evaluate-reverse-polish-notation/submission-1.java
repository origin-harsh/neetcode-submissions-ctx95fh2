class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s: tokens){
            if(s.equals("+") || s.equals("-") ||
        s.equals("*") || s.equals("/")){
                int v1 = (int)st.pop();
                int v2 = (int)st.pop();
                int result;
                if(s.equals("+")) result = v1+v2;
                else if(s.equals("-")) result = v2-v1;
                else if(s.equals("*")) result = v1*v2;
                else result = v2/v1;

             st.push(result);    
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop(); 
    }
}
