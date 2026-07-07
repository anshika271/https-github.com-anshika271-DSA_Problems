class Solution {
    public long sumAndMultiply(int n) {
   int sum=0;
   String s="";
     String str=String.valueOf(n);
    if(str.length()==0 ||n==0){
        return 0;
    }
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='0'){
            continue;
        }
        else{
        s=s+str.charAt(i);
         sum += Integer.parseInt("" + str.charAt(i));
        }
      } 
     long p=Long.parseLong(s);
     long ans=p*sum;
      return ans;
    }
}