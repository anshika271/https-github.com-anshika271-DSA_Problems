class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        mp.put(0,-1);
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
            nums[i]=-1;
           }
         
        }
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
          sum=sum+nums[i];
          if(!mp.containsKey(sum)){
            mp.put(sum,i);
          }
          else{
           count=Math.max(count,i-mp.get(sum));
          }
        }
return count;
    }
}