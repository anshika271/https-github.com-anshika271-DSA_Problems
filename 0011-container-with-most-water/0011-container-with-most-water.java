class Solution {
    public int maxArea(int[] height) {
     int i=0;
     int j=height.length-1;
     int maxx=0;
     while(i<j){
        int width=Math.min(height[i],height[j]);
        int length=j-i;
        int area=width*length;
        maxx=Math.max(maxx,area);
        if(height[i]<=height[j]){
            i++;
        }
        else{
            j--;
        }
     } 
     return maxx;  
    }
}