class Solution {
    public int jump(int[] nums) {
       int count=0;
       int lastjump=0;
       int farthest=0;
       for(int i=0;i<nums.length-1;i++){
        farthest=Math.max(farthest,i+nums[i]);

        if(i==lastjump){
            lastjump=farthest;
            count++;
        }
       } 
       return count;
    }
}