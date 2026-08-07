class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
     return (kmost(nums,k)-kmost(nums,k-1));
    }
     int kmost(int[] nums, int k){
         int j=0;
      int count=0;
      HashMap<Integer,Integer>mp=new HashMap<>();
      for(int i=0;i<nums.length;i++){
         mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
         while(mp.size()>k){
             mp.put(nums[j],mp.getOrDefault(nums[j],0)-1); 
             if(mp.get(nums[j])==0){
                mp.remove(nums[j]);
             }
             j++;
         }
         count=count+(i-j+1);
      } 
      return count; 
    }
}