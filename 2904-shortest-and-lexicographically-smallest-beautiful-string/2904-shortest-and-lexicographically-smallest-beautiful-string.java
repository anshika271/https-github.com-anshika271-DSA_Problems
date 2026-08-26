class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int j=0;
        int count=0;
      
        String ans="";
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='1'){
            count++;
           }

           while( i>=j && (count>k || s.charAt(j)=='0')){
            if(s.charAt(j)=='1'){
                count--;
            
            }
            j++;
           }
           if(count==k){
            String p=s.substring(j,i+1);
            if(ans.isEmpty() || p.length() < ans.length() 
            || (ans.length()==p.length()
               && p.compareTo(ans)<0)){
                
               ans=p; 
            }
           }
           
        }
        return ans;
    }
}