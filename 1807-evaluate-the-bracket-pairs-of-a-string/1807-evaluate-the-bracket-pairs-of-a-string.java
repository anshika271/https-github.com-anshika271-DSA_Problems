class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String>mp=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
             mp.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
       String ss="";
       int i=0;
      while(i<s.length()){
        if(s.charAt(i)=='('){
            String key="";
            
            while(i<s.length() && s.charAt(i+1)!=')'){
                key=key+s.charAt(i+1);
                i++;
            }
            
            if(mp.containsKey(key)){
                ss=ss+mp.get(key);
            }
            else{
                ss=ss+'?';
            }
            
        }
        else{
            if(s.charAt(i)!=')')
            ss=ss+s.charAt(i);
        }
        i++;
       }
       return ss;
    }
}