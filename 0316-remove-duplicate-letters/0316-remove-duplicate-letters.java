class Solution {
    public String removeDuplicateLetters(String s) {
      Stack<Character>st=new Stack<>();
      HashMap<Character,Integer>mp=new HashMap<>();
       for(int i=0;i<s.length();i++){
       mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
       } 

       HashSet<Character>visited=new HashSet<>();
       for(int i=0;i<s.length();i++){
       char ch=s.charAt(i);
       mp.put(ch,mp.getOrDefault(ch,0)-1);
       if(visited.contains(ch)){
        continue;
       }
       while(!st.isEmpty() && st.peek()>ch && mp.get(st.peek())>0){
        visited.remove(st.pop());
       }
       st.push(ch);
       visited.add(ch);
       }
       StringBuilder sb=new StringBuilder();
      for(char ch:st){
        sb.append(ch);
      }
      return sb.toString();
    }
}