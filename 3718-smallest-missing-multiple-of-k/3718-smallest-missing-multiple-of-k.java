class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        int i=1;
        ArrayList<Integer>list=new ArrayList<>();
        while(i<=nums.length+1){
           if(!st.contains(i*k)){
            list.add(i*k);
           } 
           i++;
        }
        return list.get(0);
    }
}