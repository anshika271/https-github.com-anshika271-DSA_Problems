class Solution {
    public static int firstO(int[]nums,int target){
        int i=0;
        int j=nums.length-1;
        int res=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                 res=mid;
                j=mid-1;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return res;
    }

     public static int lastO(int[]nums,int target){
        int i=0;
        int j=nums.length-1;
        int res=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                 res=mid;
                i=mid+1;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
           
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
      int[]arr={-1,-1};
     arr[0]=firstO(nums,target);
     arr[1]=lastO(nums,target);
     return arr;
      
       
    }
}