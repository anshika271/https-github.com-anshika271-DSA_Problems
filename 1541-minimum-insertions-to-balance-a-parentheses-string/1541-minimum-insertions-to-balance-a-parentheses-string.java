class Solution {
    public int minInsertions(String s) {
       Stack<Integer>st=new Stack<>();
      int ans=0;
      int count=0;
       for(int i=0;i<s.length();i++){
        
        if(s.charAt(i)=='('){
            st.push(i);
        }
        else{
            
            
           if(i+1<s.length() && s.charAt(i+1)==')'){
            i++;
           }
           else{
            ans++;
           }
           if(!st.isEmpty()){
            st.pop();
           }
           else{
            ans++;
           }
           
           
        }
        
       }
       return ans+st.size()*2;
    }
}