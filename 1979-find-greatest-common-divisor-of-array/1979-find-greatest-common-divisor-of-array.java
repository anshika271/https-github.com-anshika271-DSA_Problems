class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
       for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
       } 
        int max=0;
       for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
       }

       while(max!=0){
        int rem=min%max;
        min=max;
        max=rem;
       } 
return min;
    }
}