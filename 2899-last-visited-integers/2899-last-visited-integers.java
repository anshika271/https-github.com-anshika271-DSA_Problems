class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
       ArrayList<Integer>seen=new ArrayList<>();
       ArrayList<Integer>list=new ArrayList<>();
       int k=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=-1){
            seen.add(nums[i]);
            k=0;
        }
        else if(nums[i]==-1){
        k++;
         if(k>seen.size()){
            list.add(-1);
         }
         else{
            list.add(seen.get(seen.size()-k));
         }
          
        }
       }
       return list; 
    }
}