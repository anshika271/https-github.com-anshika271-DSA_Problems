class Solution {
    public long continuousSubarrays(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int min=Integer.MAX_VALUE;
        //     int max=Integer.MIN_VALUE;
        //     for(int j=i;j<nums.length;j++){
        //         min=Math.min(min,nums[j]);
        //         max=Math.max(max,nums[j]);

        //         if((max-min)>=0 && (max-min)<=2){
        //             count++;
        //         }
        //     }

        // }
        // return count;

        long count=0;
        int j=0;
        TreeMap<Integer,Integer>mp=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

            
            while(mp.lastKey()-mp.firstKey()>2){
               mp.put(nums[j],mp.getOrDefault(nums[j],0)-1); 
              
              if(mp.get(nums[j])==0){
                mp.remove(nums[j]);
              }
              
             j++; 
             
            }
            count=count+(i-j+1);
        }
        return count;
    }
}