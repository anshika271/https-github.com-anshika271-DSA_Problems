class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
       HashMap<Integer,Integer>mp=new HashMap<>();
      
        
   mp.put(0,1);
        int sum=0;
       for(int i=0;i<nums.length;i++){
           sum=sum+nums[i];
       int p=sum-k;
        if(mp.containsKey(p)){
            count=count+mp.get(p);

        }
        
      mp.put(sum,mp.getOrDefault(sum,0)+1);
        
       }
        return count;
    }
}