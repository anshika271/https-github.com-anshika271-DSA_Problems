class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void fun(int[]nums, ArrayList<Integer>list,HashMap<Integer,Integer>mp){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int num:mp.keySet()){

            if(mp.get(num)==0){
                continue;
            }
                list.add(num);
                mp.put(num,mp.getOrDefault(num,0)-1);
                 fun(nums,list,mp);
               
                 list.remove(list.size()-1);
                  mp.put(num,mp.getOrDefault(num,0)+1);
            
           
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
       HashMap<Integer,Integer>mp=new HashMap<>();
       for(int num:nums){
        mp.put(num,mp.getOrDefault(num,0)+1);
       } 
       ArrayList<Integer>list=new ArrayList<>();
       fun(nums,list,mp);
       return ans;
    }
}