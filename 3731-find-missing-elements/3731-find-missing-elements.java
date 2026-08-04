class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer>st=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
               st.add(nums[i]);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int p=nums[0];
        for(int i=p;i<max;i++){
           if(!st.contains(i+1)){
            list.add(i+1);
          
           }
        }
        return list;
    }
}