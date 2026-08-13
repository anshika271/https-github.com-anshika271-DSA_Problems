class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
      HashMap<Integer,Integer>mp=new HashMap<>();
      int j=0;
      int len=0;
     for(int i=0;i<nums.length;i++){
       int num=nums[i];
     
         mp.put(num,mp.getOrDefault(num,0)+1);
     
     
        while(mp.get(nums[i])>k){
            
           mp.put(nums[j],mp.getOrDefault(nums[j],0)-1);
           if(mp.get(nums[j])==0){
            mp.remove(nums[j]);
           }
           j++;  
        }
        
           len=Math.max(len,i-j+1);
       
     }
     
     return len;
    }
}