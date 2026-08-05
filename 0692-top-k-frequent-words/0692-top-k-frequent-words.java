class Solution {
    public List<String> topKFrequent(String[] words, int k) {
     
      HashMap<String, Integer>mp=new HashMap<>();
      for(int i=0;i<words.length;i++){
        String s=words[i];
        mp.put(s,mp.getOrDefault(s,0)+1);
      }  
     
      List<Map.Entry<String,Integer>>list=new ArrayList<>(mp.entrySet());
      list.sort((a,b)->{
      if(!a.getValue().equals(b.getValue())){
          return b.getValue()-a.getValue();
      }
      return a.getKey().compareTo(b.getKey());
    });
ArrayList<String>st=new ArrayList<>();
     for(int i=0;i<k;i++){
     st.add(list.get(i).getKey());
     }
     return st;
    }
}