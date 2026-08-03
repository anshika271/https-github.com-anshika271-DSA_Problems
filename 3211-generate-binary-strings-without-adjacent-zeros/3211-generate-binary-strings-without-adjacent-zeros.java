class Solution {
    StringBuilder sb=new StringBuilder();
    public  void fun(int n, ArrayList<String>list){
        if(sb.length()==n){
            list.add(sb.toString());
            return;
        }
        sb.append('1');
        fun(n,list);
       sb.deleteCharAt(sb.length()-1);
        if(sb.length()==0 || sb.charAt(sb.length()-1)!='0'){
         sb.append('0');
         fun(n,list);
           sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> validStrings(int n) {
      ArrayList<String>list=new ArrayList<>();
      fun(n,list);
      return list;
    }
}