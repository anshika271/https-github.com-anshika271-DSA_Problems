class Solution {
    public int differenceOfSum(int[] nums) {
       int Esum=0;
       int DigSum=0;
       for(int i=0;i<nums.length;i++){
        Esum=Esum+nums[i];
       } 
       
       for(int i=0;i<nums.length;i++){
        int sum=0;
        if(nums[i]>9){
            while(nums[i]>0){
                int rem=nums[i]%10;
                sum=sum+rem;
                nums[i]=nums[i]/10;
            }
            DigSum=DigSum+sum;
        }
        else{
            DigSum=DigSum+nums[i];
        }
       }
       return Math.abs(DigSum-Esum);
    }
}