class Solution {
    public int[][] generateMatrix(int n) {
      int[][]arr=new int[n][n];
      int dir=0;
      int top=0;
      int down=n-1;
      int left=0;
      int right =n-1;
      int p=1;
      while(down>=top && left<=right){
        if(dir==0){
            for(int i=left;i<=right;i++){
                arr[top][i]=p;
                p++;
            }
             top++;
        }
        if(dir==1){
            for(int i=top;i<=down;i++){
                arr[i][right]=p;
                p++;
            }
            right--;
        }
        if(dir==2){
            for(int i=right;i>=left;i--){
                arr[down][i]=p;
                p++;
            }
            down--;
        }
        if(dir==3){
            for(int i=down;i>=top;i--){
                arr[i][left]=p;
                p++;
            }
            left++;
        }
        dir=(dir+1)%4;
      } 
      return arr;
    }
}