class Solution {
    
    public int minSwaps(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
       
      int un=st.size()/2;
      return (un+1)/2;
    }
}