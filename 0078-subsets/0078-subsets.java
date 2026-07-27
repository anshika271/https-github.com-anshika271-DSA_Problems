class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void fun(int[]nums,int idx,ArrayList<Integer>list){
       
           if(idx==nums.length){
            ans.add(new ArrayList<>(list));
            return;
           }
        list.add(nums[idx]);
        fun(nums,idx+1,list);
        list.remove(list.size()-1);
        fun(nums,idx+1,list);
       
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
      ArrayList<Integer>list=new ArrayList<>();
      fun(nums,0,list);
      return ans;  
    }
}