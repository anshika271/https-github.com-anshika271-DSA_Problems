class Solution {
    int[][]dp=new int[1001][1001];
    public  int solve(int i,int j,String s){
        if(i>=j){
            dp[i][j]=1;
            return dp[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)!=s.charAt(j)){
            dp[i][j]=0;
            return dp[i][j];
        }
        dp[i][j]=solve(i+1,j-1,s);
        return dp[i][j];

    }
    public int countSubstrings(String s) {
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int count=0;
        for(int i=0;i<s.length();i++){
           
            for(int j=i;j<s.length();j++){
           
              if(solve(i,j,s)==1){
                  count++;
              }
            }
        }
        return count;
    }
}
