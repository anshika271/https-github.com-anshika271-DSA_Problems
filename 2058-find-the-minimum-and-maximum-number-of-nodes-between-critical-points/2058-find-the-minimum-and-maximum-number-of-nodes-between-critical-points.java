/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        int[]ans=new int[2];
        ListNode temp=head;
        int count=0;
         
        while(temp!=null){
         count++;
         temp=temp.next;
        }
       
        if(count>3){
            temp=head;
           int k=1;
           
            while(temp.next.next!=null){
                k++;
                if(temp.val<temp.next.val && temp.next.val>temp.next.next.val){
                    list.add(k);
                }
                else if(temp.val>temp.next.val && temp.next.val<temp.next.next.val){
                    list.add(k);
                }
                temp=temp.next;
              
            }
        }
        if(list.size()<=1){
            
         ans[0]=-1;
         ans[1]=-1;
         return ans;
        
        }
       int mindis=Integer.MAX_VALUE;
       int maxdis=0;
for(int i=0;i<list.size()-1;i++){
mindis=Math.min(list.get(i+1)-list.get(i),mindis);

}
maxdis=list.get(list.size()-1)-list.get(0);
ans[0]=mindis;
ans[1]=maxdis;        
    
       return ans;
    }
}