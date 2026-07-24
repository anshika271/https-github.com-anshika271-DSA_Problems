class Solution {
    List<String>list=new ArrayList<>();
    public static boolean check(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else{
                count--;
                if(count<0){
                    return false;
                }
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
    public void fun(int n,String s){
        if(s.length()==2 * n){
            if(check(s)){
                list.add(s);
                
            }
           return;
        }
        
        fun(n,s+"(");
       
          
        fun(n,s+")");
        
    }
    public List<String> generateParenthesis(int n) {
       
       String s="";
         fun(n,s);
         return list;
    }
}