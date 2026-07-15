class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evensum=0;
        int oddsum=0;
     int i=0;
     int even=1;
     while(i<n){
        if(even%2==0){
            evensum=evensum+even;
             i++;
        }  
          even++;
     }
  
     int j=0;
     int odd=1;
     while(j<n){
        if(odd%2!=0){
            oddsum=oddsum+odd;
            j++;
        }
         odd++;
     }
    
    while(oddsum!=0){
        int rem=evensum%oddsum;
        evensum=oddsum;
        oddsum=rem;
    } 
  return evensum;
    }
}