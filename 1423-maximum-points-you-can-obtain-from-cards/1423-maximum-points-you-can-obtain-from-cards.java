class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int Totalsum=0;
       for(int i=0;i<cardPoints.length;i++){
          Totalsum=Totalsum+cardPoints[i];

       }
       int sum=0;
      
       for(int i=0;i<cardPoints.length-k;i++){
         sum=sum+cardPoints[i];
       }
        int maxsum=Totalsum-sum;
       int start=0;
       int end=cardPoints.length-k;
       while(end<cardPoints.length){
        sum=sum+cardPoints[end];
        sum=sum-cardPoints[start];
        maxsum=Math.max(maxsum,Totalsum-sum);
        start++;
        end++;
       }
      
      return maxsum;
    }
}