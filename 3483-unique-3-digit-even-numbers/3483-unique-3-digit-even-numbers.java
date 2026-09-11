class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;

        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
              for(int k=0;k<digits.length;k++){
                if(i==j || i==k|| k==j){
                    continue;
                }
               int num=digits[i]*100+digits[j]*10+digits[k]*1;
               if( num>=100 && num%2==0){
                  st.add(num);
               }
              }  
            }
        }
        return st.size();
    }
}