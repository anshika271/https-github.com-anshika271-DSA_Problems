class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[]ans=new int[arr.length];
     HashMap<Integer,Integer>mp=new HashMap<>();
      int[]prr= arr.clone();
      Arrays.sort(arr);
       int k=0;
       for(int i=0;i<arr.length;i++){
        if(!mp.containsKey(arr[i])){
            mp.put(arr[i],k+1);
            k++;
        }
        else{
            mp.put(arr[i],k);
        }
       }
        
       for(int i=0;i<prr.length;i++){
       ans[i]=mp.get(prr[i]);
       }
       return ans;
    }
}