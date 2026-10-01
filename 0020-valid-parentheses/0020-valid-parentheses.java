class Solution {
    public static boolean fun(char x,char y){
        if(y=='(' && x==')')return true;
        if(y=='{' && x=='}')return true;
        if(y=='[' && x==']')return true;
        else
        return false;

    }
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
               char x=s.charAt(i);
               if(st.size()==0){
                return false;
               }
               
               char y=st.peek();

               if(st.size()!=0 && fun(x,y)){
                st.pop();
              
               }
               else{
                return fun(x,y);
               }
               
               
            }
        }
        return (st.size()==0);
    }
}