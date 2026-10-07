class Solution {
    ArrayList<String>list=new ArrayList<>();
int max=0;
    public void fun(String s,int idx,StringBuilder sb,int count){
       if(count<0) return;
        if(idx==s.length()){
            
            if(count==0){
                String str=sb.toString();
                if(str.length()>max){
                   max=str.length();
                     list.clear();
                   list.add(str);
                 
                }
                else if(str.length()==max){
                    if(!list.contains(str)){
                        list.add(str);
                    }
                }
            }
            return;
        }

        
        // Take
        char ch=s.charAt(idx);
        if(ch!=')' && ch!='('){
            sb.append(ch);
            fun(s,idx+1,sb,count);
            sb.deleteCharAt(sb.length() - 1);
            return;
        }

        sb.append(ch);
        if(s.charAt(idx)=='('){
            fun(s,idx+1,sb,count+1);
        }
        
        else{
            fun(s,idx+1,sb,count-1);
        }
         //Don't take
       sb.deleteCharAt(sb.length()-1);

       fun(s,idx+1,sb,count);
       

    }
    public List<String> removeInvalidParentheses(String s) {
     
      
       fun(s,0,new StringBuilder(),0);
       return list; 
    }
}