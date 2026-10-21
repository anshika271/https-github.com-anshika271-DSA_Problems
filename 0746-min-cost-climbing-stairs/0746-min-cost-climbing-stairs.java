class Solution {
    // int[]dp=new int[1001];
    // public  int solve(int[]cost,int i){
    // if(i>=cost.length){
    //     return 0;
    // }
    // if(dp[i]!=-1){
    //     return dp[i];
    // }
    // int a=cost[i]+solve(cost,i+1);
    // int b=cost[i]+solve(cost,i+2);
    
    // dp[i]= Math.min(a,b);
    // return dp[i];
    // }
    public int minCostClimbingStairs(int[] cost) {
    //   for(int i=0;i<dp.length;i++){
    //     Arrays.fill(dp,-1);
    //   } 

    //   int min=Math.min(solve(cost,0),solve(cost,1));
    //   return min;
    int n=cost.length;
  
    if(n==2){
        return Math.min(cost[0],cost[1]);
    }
    for(int i=2;i<cost.length;i++){
        cost[i]=cost[i]+Math.min(cost[i-1],cost[i-2]);
    }
    return Math.min(cost[n-1],cost[n-2]);
    }
}