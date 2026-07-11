class Solution {
    public static void pk(String s,int i,StringBuilder sb){
        if(i==s.length()){
            return;
        }
         
         if(s.charAt(i)=='i'){
           sb.reverse(); 
         }
         else{
           sb.append(s.charAt(i)); 
         }
         pk(s,i+1,sb);
    }
    public String finalString(String s) {
         StringBuilder sb=new StringBuilder();  
          pk(s,0,sb);
          return new String(sb);
    //   StringBuilder sb=new StringBuilder();
    //   for(int i=0;i<s.length();i++){
    //     if(s.charAt(i)=='i'){
    //         sb.reverse();
    //     }
    //     else{
    //         sb.append(s.charAt(i));
    //     }
    //   }
    //   return new String(sb);
    }
}