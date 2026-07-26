class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void fun(int[]candidates,int idx,int target,int sum,ArrayList<Integer>list){
       
           if(idx==candidates.length){
            if(sum==target){
                ans.add(new ArrayList<>(list));
            }
            return ;
           }
            if(sum>target){
                return;
            }

        
        // if(candidates[idx]<=target){
        list.add(candidates[idx]);
        fun(candidates,idx,target,sum+candidates[idx],list);
         list.remove(list.size()-1);
        
        
          fun(candidates,idx+1,target, sum,list);
}
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       ArrayList<Integer>list=new ArrayList<>();
       fun(candidates,0,target,0,list); 
       return ans;
    }
}