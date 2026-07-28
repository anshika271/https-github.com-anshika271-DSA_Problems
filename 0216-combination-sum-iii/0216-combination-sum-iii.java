class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void fun(int[]arr,int k,int n,int idx,int sum,ArrayList<Integer>list){
      
            if(list.size()==k){
                if(sum==n){
                ans.add(new ArrayList<>(list));
                }
                return;
            }
            
       if(idx==arr.length){
        return;
       }
            
        
        if(sum>n){
            return;
        }
        list.add(arr[idx]);
        sum=sum+arr[idx];
        fun(arr,k,n,idx+1,sum,list);
        list.remove(list.size()-1);
        sum=sum-arr[idx];
         fun(arr,k,n,idx+1,sum,list);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[]arr=new int[9];
        for(int i=1;i<=9;i++){
            arr[i-1]=i;
        }
        ArrayList<Integer>list=new ArrayList<>();
        fun(arr,k,n,0,0,list);
        return ans;
    }
}