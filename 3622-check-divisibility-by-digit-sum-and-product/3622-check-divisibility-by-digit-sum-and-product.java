class Solution {
    public boolean checkDivisibility(int n) {
        int p=1;
        int sum=0;
        int k=n;
        while(n>0){
            int rem=n%10;
            p=p*rem;
            sum=sum+rem;
            n=n/10;
        }
     int summ=p+sum;
     if(k%summ==0){
        return true;
     }

return false;
        
    }
}