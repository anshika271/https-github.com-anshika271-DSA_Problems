class Solution {
    int[]dp=new int[1001];
    public  int solve(int[]cost,int i){
    if(i>=cost.length){
        return 0;
    }
    if(dp[i]!=-1){
        return dp[i];
    }
    int a=cost[i]+solve(cost,i+1);
    int b=cost[i]+solve(cost,i+2);
    
    dp[i]= Math.min(a,b);
    return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
      for(int i=0;i<dp.length;i++){
        Arrays.fill(dp,-1);
      } 

      int min=Math.min(solve(cost,0),solve(cost,1));
      return min;
    }
}