class Solution {
    // public static int fun(int[]nums,int i){
    //     if(i>=nums.length){
    //         return 0;
    //     }
    //     int take=nums[i]+fun(nums,i+2);
    //     int dont=fun(nums,i+1);
    //     return Math.max(take,dont);

    // }
    public int rob(int[] nums) {
        // return fun(nums,0);

        int[]dp=new int[nums.length+2];
        int n=nums.length;
       
        for(int i=n-1;i>=0;i--){
            int take=nums[i]+dp[i+2];
            int dont=dp[i+1];
            dp[i]=Math.max(take,dont);
        }
        return dp[0];
    }
}