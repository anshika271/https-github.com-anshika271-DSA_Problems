class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    ArrayList<Integer>list=new ArrayList<>();
    int dir=0;
    int top=0;
    int down=matrix.length-1;
    int left=0;
    int right=matrix[0].length-1;
    while(down>=top && left<=right){
        if(dir==0){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
           top++;
        }
        if(dir==1){
            for(int i=top;i<=down;i++){
               list.add(matrix[i][right]);
            }
           right--;
        }
       
        if(dir==2){
            for(int i=right;i>=left;i--){
                list.add(matrix[down][i]);
            }
            down--;
        }
        if(dir==3){
            for(int i=down;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
        }
        dir=(dir+1)%4;
    }
    return list;
    }
}