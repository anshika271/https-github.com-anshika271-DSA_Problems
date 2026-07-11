class Solution {
    public String reverseStr(String s, int k) {
        char[]arr=s.toCharArray();
       for(int i=0;i<s.length();i=i+2*k){
        int j=i;
        int p=Math.min(i+k-1,s.length()-1);
        while(j<p){
char temp=arr[j];
arr[j]=arr[p];
arr[p]=temp;
j++;
p--;
        }
       } 
       return new String(arr);
    }
}