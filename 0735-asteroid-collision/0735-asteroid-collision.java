class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){

           while(!st.isEmpty() && asteroids[i]<0 && st.peek()>0){
               int sum=asteroids[i]+st.peek();
               if(sum<0){
                st.pop();
               }
               else if(sum>0){
                asteroids[i]=0;
               }
               else{
                asteroids[i]=0;
                st.pop();
               }
           }
           if(asteroids[i]!=0){
               st.push(asteroids[i]);
           }  
        }
        
        //  System.out.println(st);
        int[]ans=new int[st.size()];
       for(int i=ans.length-1;i>=0;i--){
        ans[i]=st.peek();
        st.pop();
       }
       return ans;
        }
       
    }
