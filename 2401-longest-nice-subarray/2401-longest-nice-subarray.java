class Solution {
    public int longestNiceSubarray(int[] nums) {
        int i=0;
        int j=0;
        int len=0;
        int mask=0;
        while(j<nums.length){

            while((mask&nums[j])!=0){
                mask=mask^nums[i];
                i++;
            }
            mask=mask | nums[j];
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}