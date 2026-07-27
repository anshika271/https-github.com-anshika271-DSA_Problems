class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void fun(int[]candidates,int idx,int target,ArrayList<Integer>list,int sum){
       
            if(sum==target){
              
               ans.add(new ArrayList<>(list));
                  return;
            }
          
        
        if(sum>target){
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]){
                continue;
            }
        
        sum=sum+candidates[i];
        list.add(candidates[i]);
        fun(candidates,i+1,target,list,sum);
         sum=sum-candidates[i];
        list.remove(list.size()-1);
       
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<Integer>list=new ArrayList<>();
        fun(candidates,0,target,list,0);
        return ans;
    }
}