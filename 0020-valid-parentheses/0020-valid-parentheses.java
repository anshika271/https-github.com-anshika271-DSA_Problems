class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
           else{
            if(st.size()==0) return false;
            
                char ch=s.charAt(i);
                char top=st.peek();
                if(samestyle(top,ch))st.pop();
                else 
                return false;
            }
           }
            return (st.size()==0);
        }
      
    
        static boolean samestyle(char a, char b){
            if(a=='(' && b==')')return true;
             if(a=='[' && b==']')return true;
              if(a=='{' && b=='}')return true;
              return false;
        }
    }
