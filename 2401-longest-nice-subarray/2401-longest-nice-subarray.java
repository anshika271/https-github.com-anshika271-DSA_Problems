class Solution {
    public int longestNiceSubarray(int[] nums) {
       int len=0;
       for(int i=0;i<nums.length;i++){
        int p=0;
        for(int j=i;j<nums.length;j++){
            if((p&nums[j])!=0){
                break;
            }
            p=p|nums[j];
            len=Math.max(len,j-i+1);
        }
       } 
       return len;
    }
}