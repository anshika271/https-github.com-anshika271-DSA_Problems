class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
           if(nums[i]<0){
            nums[i]=-nums[i];
           }
        }
        long sum=0;
      Arrays.sort(nums);
      int i=0;
      int j=nums.length-1;
      int[]arr=new int[nums.length];
      int k=0;
       while(i<=j){
        if(i==j){
            arr[k++]=nums[j];
            break;
        }
        arr[k++]=nums[j];
        arr[k++]=nums[i];
        i++;
        j--;

        
       }
    //    for(int num:arr){
    //     System.out.println(num);
    //    }
    for(int r=0;r<arr.length;r++){
        if(r%2==0){
            sum=sum+arr[r]*arr[r];
        }
        else{
            sum=sum-arr[r]*arr[r];
        }
    }
       return sum;
    }
}