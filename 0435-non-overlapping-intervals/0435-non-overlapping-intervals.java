class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int count=0;
        int i=0;
        int j=1;
        while(j<intervals.length){
            int[]cu=intervals[i];
            int[]nxt=intervals[j];

            int cs=cu[0];
            int ce=cu[1];

            int ns=nxt[0];
            int ne=nxt[1];
            if(ce<=ns){
                i=j;
                j++;
                
            }
          
            else{
                if(ce<ne){
                    j++;
                    count++;
                }
                else{
                    i=j;
                    j++;
                    count++;
                }
            }
        }
        return count;
    }
}