class Solution {
    public String removeKdigits(String num, int k) {
       Stack<Character>st=new Stack<>();
      if(num.length()==k){
        return "0";
      }
       for(int i=0;i<num.length();i++){
        while(k!=0 && !st.isEmpty() && st.peek()>num.charAt(i)){
              st.pop();
        k--;
        }
       st.push(num.charAt(i));
       
       }
       while(k>0){
        st.pop();
        k--;
       }
       String ans="";
       int n=st.size();
    //    System.out.println(st);
     for(int i=0;i<n;i++){
       ans=ans+st.peek();
       st.pop();
     }
     StringBuilder sb=new StringBuilder(ans);
     sb.reverse();
     String p=sb.toString();
     String pp="";
     for(int i=0;i<p.length();i++){
     if(pp.length()==0 && p.charAt(i)=='0'){
        continue;
     }
     else{
        pp=pp+p.charAt(i);
     }
     
     }
       return pp.length()==0?"0":pp;
    }
}