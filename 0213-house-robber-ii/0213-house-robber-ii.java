class Solution {
    // public static int fun(int[]nums,int i,int end){
    //     if(i>end){
    //         return 0;
    //     }
    //     int take=nums[i]+fun(nums,i+2,end);
    //     int not=fun(nums,i+1,end);
    //     return Math.max(take,not);
    // }
   
    public int rob(int[] nums) {
    //     if(nums.length==1){
    //         return nums[0];
    //     }
    //     if(nums.length==2){
    //         return Math.max(nums[0],nums[1]);
    //     }
    //  int p=fun(nums,0,nums.length-2);
    //  int s=fun(nums,1,nums.length-1);
    //  return Math.max(p,s); 
if(nums.length==1){
    return nums[0];
}
if(nums.length==2){
    return Math.max(nums[0],nums[1]);
}
    int[]dp=new int[nums.length+1];
    for(int i=nums.length-2;i>=0;i--){
        int take=nums[i]+dp[i+2];
        int not=dp[i+1];
        dp[i]=Math.max(take,not);
    }

      int[]dpp=new int[nums.length+2];
      for(int i=nums.length-1;i>=1;i--){
        int take=nums[i]+dpp[i+2];
        int not=dpp[i+1];
        dpp[i]=Math.max(take,not);
      }
      return Math.max(dp[0],dpp[1]);
    }
}