class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void fun(int[]nums,int idx,ArrayList<Integer>list){
       
           
            ans.add(new ArrayList<>(list));
            
          
        
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
        list.add(nums[i]);
        fun(nums,i+1,list);
        list.remove(list.size()-1);
        //  fun(nums,idx+1,list);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
      ArrayList<Integer>list=new ArrayList<>();
      fun(nums,0,list);
      return ans;  
    }
}