class Solution {
    public int[]  nsl(int[]arr){
        Stack<Integer>st=new Stack<>();
        int[]ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
             while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                    st.pop();
                  
                }
            if(st.isEmpty()){
                ans[i]=-1;
            } 
            else{
               
                 
                    ans[i]=st.peek();
            }
            
            st.push(i);
        }
       return ans;
    }

    public static int[] nsr(int[]arr){
        Stack<Integer>st=new Stack<>();
        int[]ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=arr.length;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
       return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        int[]a=nsl(arr);
        int[]n=nsr(arr);
         long sum=0;
        int m=(int)1e9+7;
    for(int i=0;i<arr.length;i++){
        int l=i-a[i];
        int r=n[i]-i;
        long ts=1L*l*r*arr[i];
        
       sum=(sum+ts)%m;

    }
return (int)sum;
    }
}