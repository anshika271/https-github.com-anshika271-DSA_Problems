class Solution {
    public int maxDepth(String s) {
        Stack<Character>st=new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                max=Math.max(max,st.size());
            }
            else{
                if(!st.isEmpty() && s.charAt(i)==')' && st.peek()=='('){
                   st.pop();
                }
            }
        }
        return max;
    }
}