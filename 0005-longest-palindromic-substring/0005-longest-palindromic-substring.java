class Solution {
    int[][]dp=new int[1001][1001];
    public int fun(int i,int j,String s){
        
        // while(i<=j){
        //     if(s.charAt(i)!=s.charAt(j)){
        //         return false;
        //     }
        //     else{
        //         i++;
        //         j--;
        //     }
        // }
        // return true;

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
       dp[i][j]=fun(i+1,j-1,s);
       return dp[i][j];


    }

    
   
    public String longestPalindrome(String s) {
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int max=0;
        String ans="";
        for(int i=0;i<s.length();i++){
             String p="";
            for(int j=i;j<s.length();j++){
                p=p+s.charAt(j);
                 if(fun(i,j,s)==1){
                  if(max<j-i+1){
                      ans=p;
                      max=j-i+1;
                  }
                    
                 }
            }
        }
        // System.out.println(max);
       return ans; 
    }
}