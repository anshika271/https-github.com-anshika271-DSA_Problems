class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>mp=new HashMap<>();
        
        for(int i=0;i<t.length();i++){
        mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }
        int start=0;
        int j=0;
        int minlen=Integer.MAX_VALUE;
        int n=t.length();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                if(mp.get(s.charAt(i))>0){
                    n--;
                }
                mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)-1);

                
                
            }
            while(n==0){
              if(i-j+1<minlen){
                minlen=i-j+1;
               start=j;
              }

              if(mp.containsKey(s.charAt(j))){
                 mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
                

                 if(mp.get(s.charAt(j))>0){
                    n++;
                 }
              }
               j++; 
            }
        }
        return (minlen==Integer.MAX_VALUE) ?"":s.substring(start,start+minlen);
    }
}