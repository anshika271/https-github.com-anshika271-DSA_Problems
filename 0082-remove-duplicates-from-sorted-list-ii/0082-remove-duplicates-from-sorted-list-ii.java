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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
          mp.put(temp.val,mp.getOrDefault(temp.val,0)+1); 
          temp=temp.next; 
        }
       temp=head;
       ListNode dummy=new ListNode(0);
        ListNode newnode=dummy;
       while(temp!=null){
        if(mp.get(temp.val)==1){
          newnode.next=new ListNode(temp.val);
          newnode=newnode.next;
        }
        temp=temp.next;
       }
       
        return dummy.next;
    }

}