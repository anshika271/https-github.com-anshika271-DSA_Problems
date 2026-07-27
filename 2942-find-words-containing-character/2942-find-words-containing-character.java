class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>list=new ArrayList<>();
        int k=0;
        for(int i=0;i<words.length;i++){
            
            String s=words[i];
            int j=0;
            while(j<s.length()){
                if(s.charAt(j)==x){
                    list.add(k);
                    break;
                }
                j++;
            }
            k++;
        }
        return list;
    }
}