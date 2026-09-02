class Solution {
    public boolean uniformArray(int[] nums1) {
        int even=0;
        int odd=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
           for(int j=i+1;j<nums1.length;j++){
            if((nums1[i]-nums1[j])%2==0){
                even++;
            }
            else{
                odd++;
            }
           }
           if(even>=nums1.length || odd>=nums1.length){
            return true;
           }
        }
        return false;
    }
}