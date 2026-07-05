class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
       int[]ans=new int[queries.length];
     
       HashMap<Integer,Integer>mp=new HashMap<>();
       int k=1;
       for(int i=0;i<nums.length;i++){
         if(nums[i]==x){
            mp.put(k,i);
            k++;
         }
       } 
    for(int i=0;i<queries.length;i++){
        if(mp.containsKey(queries[i])){
            ans[i]=mp.get(queries[i]);
        }
        else{
            ans[i]=-1;
        }
    }
    return ans;
    }
}