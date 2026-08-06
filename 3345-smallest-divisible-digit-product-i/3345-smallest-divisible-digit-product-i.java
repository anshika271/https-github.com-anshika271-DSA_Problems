class Solution {
    public static int fun(int n){
        int sum=1;
        while(n!=0){
            int rem=n%10;
            sum=sum*rem;
            n=n/10;
        }
        return sum;
    }
    public int smallestNumber(int n, int t) {
      
      
      while(fun(n)%t!=0){
        n++;
      }
      
    
      return n;  
    }
}