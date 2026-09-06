class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0){
            return false;
        }
        TreeMap<Integer,Integer>mp=new TreeMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        

        while(!mp.isEmpty()){
            int start=mp.firstKey();

            for(int i=0;i<k;i++){
                if(!mp.containsKey(start+i)){
                    return false;
                }
                mp.put(start+i,mp.get(start+i)-1);

                if(mp.get(start+i)==0){
                    mp.remove(start+i);
                }
            }
        }
        return true;
    }
}