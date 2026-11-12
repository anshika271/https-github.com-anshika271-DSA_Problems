class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1;
        int max=1;
     for(int i=1;i<nums.length;i++){
        if(nums[i-1]<nums[i]){
            inc++;
          max=Math.max(inc,max);
        }
        else{
            inc=1;
        }


     }   

      int dec=1;
        int max1=1;
     for(int i=1;i<nums.length;i++){
        if(nums[i-1]>nums[i]){
            dec++;
          max1=Math.max(dec,max1);
        }
        else{
            dec=1;
        }


     }
     return Math.max(max,max1);   
    }
}