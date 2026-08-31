class Solution {
    public int minimumDeletions(int[] nums) {
        int minidx=0;
        int maxidx=0;
        for(int i=1;i<nums.length;i++){
           if(nums[i]<nums[minidx]){
            minidx=i;
           } 

           if(nums[i]>nums[maxidx]){
            maxidx=i;
           }
        }
        
        int n=nums.length;
       int left=Math.min(minidx,maxidx);
       int right=Math.max(minidx,maxidx);
       //1

       int lefts=left+1;
       int rights=n-right;
       int ans1=lefts+rights;

       //2
       int ans2=right+1;

       //3
       int ans3=n-left;

       int p=Math.min(ans1,ans2);
       int anss=Math.min(p,ans3);
return anss;
    }
}