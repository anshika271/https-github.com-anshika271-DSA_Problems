class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=0;
        int fsi=Integer.MAX_VALUE;
        int idx=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int min=nums[i];
            max=Math.max(max,nums[i]);
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
            }
           if(max-min<=k){
            fsi=Math.min(fsi,max-min);
            idx=Math.min(idx,i);
           }
        }
        return idx==Integer.MAX_VALUE?-1:idx;
    }
}