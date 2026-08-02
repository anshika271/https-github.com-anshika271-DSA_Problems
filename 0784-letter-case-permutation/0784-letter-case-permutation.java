class Solution {
     StringBuilder sb=new StringBuilder();
     ArrayList<String>ans=new ArrayList<>();
    void fun(int idx,String s){
        if(idx==s.length()){
          ans.add(sb.toString());
          return ;
        }
        if(Character.isDigit(s.charAt(idx))){
            sb.append(s.charAt(idx));
            fun(idx+1,s);
            sb.deleteCharAt(sb.length()-1);
        }
        else{
            sb.append(Character.toUpperCase(s.charAt(idx)));
            fun(idx+1,s);
            sb.deleteCharAt(idx);

             sb.append(Character.toLowerCase(s.charAt(idx)));
            fun(idx+1,s);
            sb.deleteCharAt(idx);
        }
    }
    public List<String> letterCasePermutation(String s) {
       fun(0,s);
   return ans;

    }
}