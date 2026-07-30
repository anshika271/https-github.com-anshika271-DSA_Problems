class Solution {
    public String greatestLetter(String s) {
        HashSet<Character>st=new HashSet<>();
       for(int i=0;i<s.length();i++){
          st.add(s.charAt(i)); 
        } 
        for(char ch='Z';ch>='A';ch--){
        if(st.contains(ch) && st.contains(Character.toLowerCase(ch))){
            return String.valueOf(ch);
        }
        }
        return "";
    }
}