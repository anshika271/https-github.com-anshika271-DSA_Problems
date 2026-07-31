class Solution {
    public int minimumPushes(String word) {
      
       HashMap<Character,Integer>mp=new HashMap<>();
       for(int i=0;i<word.length();i++){
        mp.put(word.charAt(i),mp.getOrDefault(word.charAt(i),0)+1);
       }
       int ans=0;
      
       ArrayList<Integer>list=new ArrayList<>();
       for(char ch:mp.keySet()){
          list.add(mp.get(ch));
       }
       Collections.sort(list,Collections.reverseOrder());
       for(int i=0;i<list.size();i++){
         int p=i/8+1;
          ans=ans+p*list.get(i);
         
       }
       return ans;
    }
}