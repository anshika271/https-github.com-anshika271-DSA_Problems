class Solution {
    ArrayList<String>list=new ArrayList<>();
    public  boolean check(String s){
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
    public  void fun(int n,String ss){
        if( ss.length()==2*n){
            if(check(ss)){
                 list.add(ss);
            }
          
            return;
        }
      
        fun(n,ss+'(');
        
        fun(n,ss+')');
        
    }
    public List<String> generateParenthesis(int n) {
       fun(n,"");
      
      
        return list;
    }
}