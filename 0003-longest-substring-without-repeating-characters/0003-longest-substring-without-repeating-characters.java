class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer>mp=new HashMap<>();
       int len=0;
       int j=0;
       int i=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            mp.put(ch,mp.getOrDefault(ch,0)+1);

            if(mp.size()==j-i+1){   
            len=Math.max(len,j-i+1);
            
            }
            else if(mp.size()<j-i+1){
                while(mp.size()<j-i+1){
                    char p=s.charAt(i);
                    mp.put(p,mp.getOrDefault(p,0)-1);
                    if(mp.get(p)==0){
                        mp.remove(p);
                    }
                    i++;
                     
                }
               
            }
             j++;
        }
        return len;
    }
}