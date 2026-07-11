class Solution {
    public static void p(int[]nums,int n,int[]ans)
    {
        
      
        if(n==nums.length){
            return ;
        }
       
            ans[n]=nums[nums[n]];
        
       p(nums,n+1,ans);
      
    }
    public int[] buildArray(int[] nums) {
        int[]ans=new int[nums.length];
     
      p(nums,0,ans);
      return ans;
    }
}