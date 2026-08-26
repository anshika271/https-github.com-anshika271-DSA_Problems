class Solution {
 List<List<Integer>>ans=new ArrayList<>();
  public void twoSum(int[]arr, int target,int i,int j){
   
    while(i<j){
       
        if(arr[i]+arr[j]>target){
            j--;
        }
        else if(arr[i]+arr[j]<target){
            i++;
        }
        else{
           ArrayList<Integer>list=new ArrayList<>();

            list.add(-target);
            list.add(arr[i]);
            list.add(arr[j]);

            ans.add(list);
 i++;
        j--;
             while(i<j && arr[i]==arr[i-1]) i++;
            while(i<j && arr[j]==arr[j+1]) j--;
        }
       
    }
    
  }
    public List<List<Integer>> threeSum(int[] nums) {
       // List<List<Integer>>ans=new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
          
        //     for(int j=i+1;j<nums.length;j++){
                
        //         for(int k=j+1;k<nums.length;k++){
        //               ArrayList<Integer>list=new ArrayList<>();
        //             if(nums[i]+nums[j]+nums[k]==0){
                        
        //                    list.add(nums[i]);
        //                     list.add(nums[j]);
        //                      list.add(nums[k]);
        //                       if(!ans.contains(list)){
        //             ans.add(list);
                       
        //             }
                   
        //         }
        //         }
                
        //     }
           
        // }
        // return ans;
         ans.clear();
        Arrays.sort(nums);
       
         int n=nums.length;
         
        
    
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int n1=nums[i];
            int target=-n1;
        if(nums[i]>0){
            break;
        }
           twoSum(nums,target,i+1,n-1);
            
        }
      
        return  ans;
    }
}