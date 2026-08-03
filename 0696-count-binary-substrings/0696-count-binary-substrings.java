class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0;
        int curr=1;
        int ans=0;
        int i=1;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(i-1)){
                curr++;
            }
            else{
                ans=ans+Math.min(prev,curr);
                prev=curr;
                curr=1;
            }
            i++;
        }
       return ans+Math.min(prev,curr);
        
    }
}