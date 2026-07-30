class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void fun(int[]nums,ArrayList<Integer>list){
       if(nums.length==list.size()){
        ans.add(new ArrayList<>(list));
        return;
       }
       for(int i=0;i<nums.length;i++){
        if(!list.contains(nums[i])){
            list.add(nums[i]);
            fun(nums,list);
            list.remove(list.size()-1);
        }
       }
    }
    public List<List<Integer>> permute(int[] nums) {
       ArrayList<Integer>list=new ArrayList<>();
fun(nums,list);
return ans;
    }
}