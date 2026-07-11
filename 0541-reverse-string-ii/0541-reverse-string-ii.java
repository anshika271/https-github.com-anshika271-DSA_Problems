class Solution {
    public static void pk(char[]arr , int i,int k)
    {
     
      int j=i;
      int p=Math.min(i+k-1,arr.length-1);
      if(j>=arr.length){
        return;
      }
        while(j<p){
char temp=arr[j];
arr[j]=arr[p];
arr[p]=temp;
j++;
p--;
        }
        pk(arr,i+2*k,k);
    }
    public String reverseStr(String s, int k) {
      char[]arr=s.toCharArray();
      pk(arr,0,k);
        return new String(arr);
       } 
     
    }
