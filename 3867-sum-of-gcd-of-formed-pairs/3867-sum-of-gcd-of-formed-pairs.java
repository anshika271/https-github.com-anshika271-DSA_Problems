class Solution {
    public static int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int[]max=new int[nums.length];
        max[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            max[i]=Math.max(max[i-1],nums[i]);
        }
       
       int[]p=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        int k=gcd(nums[i],max[i]);
        p[i]=k;
       }
    
       Arrays.sort(p);
       int i=0;
       int j=p.length-1;
       long sum=0;
       while(i<j){
        int c=gcd(p[i],p[j]);
        sum=sum+c;
        i++;
        j--;
       }
       return sum;
    }
}