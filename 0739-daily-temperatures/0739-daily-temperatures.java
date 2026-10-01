class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int[]ans=new int[temperatures.length];
    //    for(int i=0;i<temperatures.length;i++){
    //     boolean f=false;
    //     for(int j=i+1;j<temperatures.length;j++){
    //         if(temperatures[i]<temperatures[j]){
    //             ans[i]=j-i;
    //             f=true;
    //             break;
    //         }
    //     }
    //     if(!f){
    //         ans[i]=0;
    //     }
    //    }
    //    return ans; 
Stack<Integer>st=new Stack<>();

for(int i=0;i<temperatures.length;i++){
   
      
    while(st.size()>0 && temperatures[st.peek()]<temperatures[i]){
       
        int idx= st.pop();
          ans[idx]=i-idx;
    
    }
       
    
    // if(!f){
    //     ans[i-1]=0;
    // }
    
st.push(i);
    

}
return ans;

    }
}