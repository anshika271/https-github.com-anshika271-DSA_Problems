class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer>st=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
       
        
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
            st.add(nums[i]);
        }
        
      System.out.println(min + " "+max);
        for(int i=min;i<max;i++){
           if(!st.contains(i+1)){
            list.add(i+1);
          
           }
        }
        return list;
    }
}