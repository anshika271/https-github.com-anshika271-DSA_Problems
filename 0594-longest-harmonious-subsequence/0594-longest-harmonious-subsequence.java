class Solution {
    public int findLHS(int[] nums) {
    //    Arrays.sort(nums);
    //    int len=0;
      
    //    for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         if(nums[j]-nums[i]>1){
    //             break;
    //         }
    //         else if(nums[j]-nums[i]==1){
    //               len=Math.max(len,j-i+1);
    //         }
    //     }
    //    }

    // int i=0;
    // int j=i+1;
    // while(j<nums.length){
    //  if(nums[j]-nums[i]>1){
    //     i++;
    //  }
    //  else if(nums[j]-nums[i]==0){
    //     j++;
    //  }
    //  else if(nums[j]-nums[i]==1)
    //  {
    //   len=Math.max(len,j-i+1);
    //   j++;
    //  }
   
    // }

  
    int j=0;
    HashMap<Integer,Integer>mp=new HashMap<>();
    int len=0;
    while(j<nums.length){
    mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
    j++;
    }
    for(int num:mp.keySet()){
        if(mp.containsKey(num+1)){
            int lenp=mp.get(num)+mp.get(num+1);
           len=Math.max(len,lenp);
        }
    }

       return len;
    }
}