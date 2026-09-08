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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            
            while(temp!=null){
             list.add(temp.val);
             temp=temp.next;
            }
        }
        Collections.sort(list);
        ListNode newnode =new ListNode(-1);
        ListNode dummy=newnode;
        for(int num:list){
           dummy.next=new ListNode(num);
            dummy=dummy.next;
        }
        return newnode.next;
    }
}