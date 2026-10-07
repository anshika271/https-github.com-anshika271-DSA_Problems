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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){
            return head;
        }
        ArrayList<Integer>list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
       
      for(int i=0;i+k<=list.size();i=i+k){
        int p=i;
        int j=(i+k)-1;
      
           while(p<j){
              int tempp=list.get(p);
             list.set(p, list.get(j));
              list.set(j, tempp);
            p++;
            j--;
    }
            
    
     
        
       }
      ListNode dummy=new ListNode(-1);
      ListNode tem=dummy;
      for(int i=0;i<list.size();i++){
        tem.next=new ListNode(list.get(i));
        tem=tem.next;
      }
return dummy.next;
    }
}