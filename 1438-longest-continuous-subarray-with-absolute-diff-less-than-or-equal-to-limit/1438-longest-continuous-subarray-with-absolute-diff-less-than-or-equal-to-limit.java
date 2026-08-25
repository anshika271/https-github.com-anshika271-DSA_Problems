class Solution {
    public int longestSubarray(int[] nums, int limit) {
       
    //     int maxLen=0;
        
    //    for(int i=0;i<nums.length;i++){
    //      int min=Integer.MAX_VALUE;
    //     int max=Integer.MIN_VALUE;
    //     for( int j=i;j<nums.length;j++){
    //         min=Math.min(min, nums[j]);
    //         max=Math.max(max,nums[j]);
    //         if((max-min)<=limit){
    //             maxLen=Math.max(maxLen,j-i+1);
    //         }
            
    //     }
       
    //    } 
    //    return maxLen;

    int j=0;
    int maxlen=0;
    TreeMap<Integer,Integer>mp=new TreeMap<>();
    for(int i=0;i<nums.length;i++){
     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

     while(mp.lastKey()-mp.firstKey()>limit){
        mp.put(nums[j],mp.getOrDefault(nums[j],0)-1);
       
        if(mp.get(nums[j])==0){
            mp.remove(nums[j]);
        }
        j++;
     }
     maxlen=Math.max(maxlen,i-j+1);
    }
    return maxlen;
    }
}