class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        int j=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);

            while(mp.get(s.charAt(i))>2){
                 mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)-1);
                 j++;
            }
        max=Math.max(max,i-j+1);
        }
        return max;
    }
}