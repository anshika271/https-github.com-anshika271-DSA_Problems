class Solution {
    public int findMaxLength(int[] nums) {
        int[]arr=new int[nums.length];
       for(int i=0;i<nums.length;i++) {
        if(nums[i]==0){
            arr[i]=-1;
        }
        else{
            arr[i]=1;
        }
       }
       int sum=0;
    int currlength=0;
       HashMap<Integer,Integer>mp=new HashMap<>();
       mp.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum=sum+arr[i];
           
            if(mp.containsKey(sum)){
                
            currlength=Math.max(currlength,i-mp.get(sum));
            }
            else
            mp.put(sum,i);
        }
return currlength;
    }
}