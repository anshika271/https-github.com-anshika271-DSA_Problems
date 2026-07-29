class Solution {
   public static void fun(String digits,String p,int idx,ArrayList<String>list,HashMap<Character,String>mp){
    if(idx==digits.length()){
        list.add(p);
        return;
    }
    String t=mp.get(digits.charAt(idx));
    for(int i=0;i<t.length();i++){
          p=p+t.charAt(i);
        fun(digits,p,idx+1,list,mp);
         p = p.substring(0, p.length() - 1);
         
    }
   }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String>mp=new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
         mp.put('4',"ghi");
          mp.put('5',"jkl");
           mp.put('6',"mno");
            mp.put('7',"pqrs");
             mp.put('8',"tuv");
              mp.put('9',"wxyz");
               
              ArrayList<String>list=new ArrayList<>();
              fun(digits,"",0,list,mp);
              return list;
    }
}