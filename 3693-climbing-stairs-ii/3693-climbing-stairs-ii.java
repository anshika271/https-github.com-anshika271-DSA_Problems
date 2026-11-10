class Solution {
   
    public static int fun(int n, int[]costs,int i,int[]dp){
        if(i==n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
       int cost=Integer.MAX_VALUE;
        int j=i+1;
        if(j<=n){
             cost=costs[j-1]+(j-i)*(j-i)+fun(n,costs,j,dp);
        }
        
         j=i+2;
        if(j<=n){
            cost=Math.min(cost,costs[j-1]+(j-i)*(j-i)+fun(n,costs,j,dp));
        }

         j=i+3;
          if(j<=n){
            cost=Math.min(cost,costs[j-1]+(j-i)*(j-i)+fun(n,costs,j,dp));
        }

return dp[i]=cost;
    }
    public int climbStairs(int n, int[] costs) {
         int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return fun(n,costs,0,dp);
    }
}