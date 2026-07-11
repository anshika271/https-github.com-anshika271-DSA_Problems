class Solution {
    public String reverseOnlyLetters(String s) {
    char[]arr=s.toCharArray();
    int i=0;
    int j=s.length()-1;
 while(i<j){
   if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j))){
   
    char temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
i++;
j--;
   }

    
    else if(!Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j))) {
        i++;
    } 
    else if(Character.isLetter(s.charAt(i)) && !Character.isLetter(s.charAt(j))){
        j--;
    } 
    else{
        i++;
        j--;
    }
 }
    return new String(arr);
    }
}