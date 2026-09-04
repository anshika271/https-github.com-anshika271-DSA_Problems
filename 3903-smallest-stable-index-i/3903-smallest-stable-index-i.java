class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // int max=0;
        // int fsi=Integer.MAX_VALUE;
        // int idx=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int min=nums[i];
        //     max=Math.max(max,nums[i]);
        //     for(int j=i;j<nums.length;j++){
        //         min=Math.min(min,nums[j]);
        //     }
        //    if(max-min<=k){
        //     fsi=Math.min(fsi,max-min);
        //     idx=Math.min(idx,i);
        //    }
        // }
        // return idx==Integer.MAX_VALUE?-1:idx;

        int[]max=new int[nums.length];
       
        max[0]=nums[0];
      
        for(int i=1;i<nums.length;i++){
          max[i]=Math.max(max[i-1],nums[i]);
         
           
        }
        int[]min=new int[nums.length];
        min[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            min[i]=Math.min(min[i+1],nums[i]);
        }
      int less=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
           if(max[i]-min[i]<=k){
            less=Math.min(less,i);
           }
        }
        return less==Integer.MAX_VALUE?-1:less;
    }
}