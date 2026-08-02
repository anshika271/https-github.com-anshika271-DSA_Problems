class Solution {
    public boolean checkValid(int[][] matrix) {
       
        for(int i=0;i<matrix.length;i++){
             HashSet<Integer>st=new HashSet<>();
            for(int j=0;j<matrix[0].length;j++){
                if(st.contains(matrix[i][j])){
                   return false;   
                }
                else{
                    st.add(matrix[i][j]);
                }
            }
            
        }
        for(int i=0;i<matrix[0].length;i++){
             HashSet<Integer>st=new HashSet<>();
            for(int j=0;j<matrix.length;j++){
               if(st.contains(matrix[j][i])){
                   return false;   
                }
                else{
                    st.add(matrix[j][i]);
                }
            }
        }
        return true;
    }
}