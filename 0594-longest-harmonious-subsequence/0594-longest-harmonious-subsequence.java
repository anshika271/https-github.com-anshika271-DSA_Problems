class Solution {
    public int findLHS(int[] nums) {
       Arrays.sort(nums);
       int len=0;
      
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]-nums[i]>1){
                break;
            }
            else if(nums[j]-nums[i]==1){
                  len=Math.max(len,j-i+1);
            }
        }
       } 
       return len;
    }
}