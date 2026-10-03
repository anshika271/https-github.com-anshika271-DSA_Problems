class Solution {
    public int longestValidParentheses(String s) {
    //     Stack<Integer>st=new Stack<>();
    //   st.add(-1);
    //     int max=0;
    //     for(int i=0;i<s.length();i++){
    //        if(s.charAt(i)=='(')
    //        {
    //         st.push(i);
    //        }
           
    //        else{
          
    //         st.pop();
            
    //         if(st.isEmpty()){
    //             st.push(i);
    //         }
    //         else
    //        max=Math.max(max,i-st.peek());
    //        }
    //     }
       
       int count=0;
       int start=0;
       int max=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            count++;
        }
        else{
            count--;
        }

        if(count==0){
            max=Math.max(max,i-start+1);
        }
        if(count<0){
            count=0;
            start=i+1;
        }
       }

        count=0;
       start=s.length()-1;
      
       for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)==')'){
            count++;
        }
        else{
            count--;
        }

        if(count==0){
            max=Math.max(max,start-i+1);
        }
        if(count<0){
            count=0;
            start=i-1;
        }
       }
        return max;
    }
}