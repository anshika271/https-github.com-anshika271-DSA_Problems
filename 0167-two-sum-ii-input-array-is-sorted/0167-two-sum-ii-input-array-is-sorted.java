class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[]arr=new int[2];
       HashMap<Integer,Integer>mp=new HashMap<>();
       for(int i=0;i<numbers.length;i++){
        int p=target-numbers[i];
        if(mp.containsKey(p)){
          arr[0]=mp.get(p);
          arr[1]=i+1;  
        }
    mp.put(numbers[i],i+1);
       }
       return arr;
    }
}