class Solution {
    public int findPeakElement(int[] nums) {
        int p=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                p=Math.max(p,i);
               
            }
        }
        return p;
    }
}