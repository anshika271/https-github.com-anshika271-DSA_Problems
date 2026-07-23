class Solution {
    public static double fun(double x,long n){
        if(n==0){
            return 1;
        }
        double p=fun(x,n/2);
        double ans=p*p;
        if(n%2==1){
            return ans*x;
        }
        return ans;
    }
    public double myPow(double x, int n) {
      long N=n;
        if(N<0){
        x=1/x;
        N=-N;
        }
        return fun(x,N);
    }
}