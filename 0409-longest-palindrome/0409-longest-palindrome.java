class Solution {
    public int longestPalindrome(String s) {
      HashMap<Character,Integer>mp=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        mp.put(ch,mp.getOrDefault(ch,0)+1);
      }  
    boolean oddd=false;
   
    int length=0;
  

   for(int num:mp.values()){
    if(num%2==0){
        length=length+num;
    }
    else{
        length+=num-1;
       
        oddd=true;
    }
   }
   if(oddd){
    length++;
   }
   
    
   

   
   
    return length;
    }
}