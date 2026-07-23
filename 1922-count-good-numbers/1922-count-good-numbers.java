class Solution {
   static final int m = 1000000007;
    public static long fun(long x,long n){
        if(n==0){
            return 1;
        }
        long p=fun(x,n/2);
        long ans=(p*p)%m;
        if(n%2==1){
            return (ans*x)%m;
        }
        return ans;
    }
    public int countGoodNumbers(long n) {
       long even=(n+1)/2;
       long odd=n/2;
   long ans =fun(5,even);
  long p=fun(4,odd);
  return (int)((ans*p)%m);
    }
}