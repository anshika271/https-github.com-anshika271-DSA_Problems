class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int p=truckSize;
        int sum=0;
        for(int i=0;i<boxTypes.length;i++){
            if(p>=boxTypes[i][0]){
                sum=sum+boxTypes[i][0]*boxTypes[i][1];
                p=p-boxTypes[i][0];
            }
            else{
                  
                   sum=sum+p*boxTypes[i][1];
                 break;
            }
          
        }
        return sum;
    }
}