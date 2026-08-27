class Solution {
   HashSet<Integer>seen=new HashSet<>();
    List<List<Integer>>ans=new ArrayList<>();
    public  void fun(int[]nums,ArrayList<Integer>list){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!seen.contains(nums[i])){
                list.add(nums[i]);
                seen.add(nums[i]);
                //explore
                fun(nums,list);
                //backtrack
                list.remove(list.size()-1);
                seen.remove(nums[i]);

            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        fun(nums,list);
        return ans;
    }
}