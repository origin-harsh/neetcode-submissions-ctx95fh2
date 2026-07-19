class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String num : operations){
            if(num.equals("+")){
                int first = st.get(st.size()-1);
                int sec = st.get(st.size()-2);
                st.push(first + sec);
            }
            else if(num.equals("D")){
                int prev = st.get(st.size()-1);
                st.push(prev*2);
            }
            else if(num.equals("C")){
                st.pop();
            }
            else{
                int n = Integer.parseInt(num);
                st.push(n);
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}