class Solution {
    public int numberOfSpecialChars(String word) {
       HashSet<Character>st=new HashSet<>();
       for(int i=0;i<word.length();i++){
        st.add(word.charAt(i));
       } 
       int count=0;
       for(char ch='A';ch<='Z';ch++){
        if(st.contains(ch) && st.contains(Character.toLowerCase(ch))){
            count++;
        }
       }
       return count;
    }
}