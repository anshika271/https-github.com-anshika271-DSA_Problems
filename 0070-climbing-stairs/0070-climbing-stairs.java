class Solution {
    // public static int fun(int n){
    //     if(n==1 || n==0){
    //         return 1;
    //     }
    //     int count=fun(n-1)+fun(n-2);
    //     return count;
    // }
    public int climbStairs(int n) {
    //    return fun(n);
    int count=0;
    int[]dp=new int[n+1];
    dp[0]=1;
    dp[1]=1;
    for(int i=2;i<=n;i++){
      dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
    }
}