class Solution {
    public String frequencySort(String s) {
    HashMap<Character,Integer>mp=new HashMap<>();
      for(int i=0;i<s.length();i++){
        mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        
      }
       List<Map.Entry<Character,Integer>>list=new ArrayList<>(mp.entrySet());  
          list.sort((a,b)->b.getValue()-a.getValue());
     
      String t="";
     for(Map.Entry<Character,Integer>en:list){
        int i=0;
        while(i<en.getValue()){
           t=t+en.getKey();
           i++;
        }
     }
     return t;
    }

}