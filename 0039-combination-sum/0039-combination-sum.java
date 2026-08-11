class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public  void fun(int[]arr,int target,int idx, ArrayList<Integer>list,int sum){
      if(sum==target) {
        ans.add(new ArrayList<>(list));
        return;
      }
      if(idx==arr.length){
        return;
      }
    if(sum>target){
        return;
    }
      list.add(arr[idx]);
      sum=sum+arr[idx];
      fun(arr,target,idx,list,sum);

      list.remove(list.size()-1);
      sum=sum-arr[idx];
       fun(arr,target,idx+1,list,sum);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       ArrayList<Integer>list=new ArrayList<>();
        fun(candidates,target,0,list,0);
        return ans;
    }
}