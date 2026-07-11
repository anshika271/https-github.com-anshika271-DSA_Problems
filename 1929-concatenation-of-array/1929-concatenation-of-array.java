class Solution {
    public static void p(int[]nums, int n,int[]ans){
        
        if(n==nums.length*2){
            return;
        }
        ans[n]=nums[n%nums.length];
        p(nums,n+1,ans);
    }
    public int[] getConcatenation(int[] nums) {
       int[]ans=new int[nums.length*2];
       p(nums,0,ans);
       return ans; 
    }
}