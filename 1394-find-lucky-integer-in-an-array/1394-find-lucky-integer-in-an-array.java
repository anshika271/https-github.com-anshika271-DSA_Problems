class Solution {
    public int findLucky(int[] arr) {
      HashMap<Integer,Integer>mp=new HashMap<>();
      for(int i=0;i<arr.length;i++){
        mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
      } 
      int max=0;
      boolean f=false;
      for(int num:mp.keySet()){
        if(mp.get(num)==num){
            max=Math.max(max,num);
            f=true;
        }
       
      }
      if(f){
        return max;
      }
      return -1;
    }
}