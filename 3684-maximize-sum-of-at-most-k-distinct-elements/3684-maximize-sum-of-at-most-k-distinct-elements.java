class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
       
        HashSet<Integer>st=new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        int[]c=new int[st.size()];
        int i=0;
        for(int num:st){
            c[i++]=num;
        }
        Arrays.sort(c);
       int size=Math.min(c.length,k);
        int p=0;
       int[]arr=new int[size];
        for(int j=c.length-1;j>=c.length-size;j--){
          arr[p++]=c[j];
        }
        return arr;
    }
}