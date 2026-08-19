class Solution {
    public static int BS(int[]nums,int target,int l,int h){
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
              return mid;

            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static int findPivot(int[]nums,int l,int r){
    l=0;
     r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return r;
    }
    public int search(int[] nums, int target) {
     int pivot=findPivot(nums,0,nums.length-1);
     int l=BS(nums,target,0,pivot-1);
     if(l!=-1){
        return l;
     }

    
     return BS(nums,target,pivot,nums.length-1);
     
}
}