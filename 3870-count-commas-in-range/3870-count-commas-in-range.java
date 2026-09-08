class Solution {
    public int countCommas(int n) {
        long count=0;
        long start=1000;
        while(start<=n){
            count=count+(n-start)+1;
            start=start*1000;
        }
        
        return (int)count;
    }
}