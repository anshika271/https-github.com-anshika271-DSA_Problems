class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        HashSet<Character>stt=new HashSet<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),i);
        }
        
          
        Stack<Character>st=new Stack<>();
       
        for(int i=0;i<s.length();i++){

            if(stt.contains(s.charAt(i))){
                continue;
            }
            
                while(!st.isEmpty() && s.charAt(i)<st.peek() && mp.get(st.peek())>i){
                  char p=  st.pop();
                    stt.remove(p);
                }

               st.push(s.charAt(i));
               stt.add(s.charAt(i));
               
             

        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
}