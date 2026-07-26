class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public  void fun(ArrayList<Integer>listt,int idx,int k,ArrayList<Integer>list){
        if(idx==listt.size()){
            if(list.size()==k){
             ans.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(listt.get(idx));
        fun(listt,idx+1,k,list);
        list.remove(list.size()-1);
        fun(listt,idx+1,k,list);
    }
    public List<List<Integer>> combine(int n, int k) {
      ArrayList<Integer>list=new ArrayList<>();
      for(int i=1;i<=n;i++){
    list.add(i);
      }
      ArrayList<Integer>p=new ArrayList<>();
      fun(list,0,k,p);  
      return ans;
    }
}