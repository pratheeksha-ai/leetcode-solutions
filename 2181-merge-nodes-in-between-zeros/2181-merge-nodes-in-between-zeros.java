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
    public ListNode mergeNodes(ListNode head) {
        ListNode mergenode=head.next;
        ListNode current=head.next;
        while(mergenode!=null)
        {
            int sum=0;
            while(mergenode.val!=0)
            {
                sum=sum+mergenode.val;
                mergenode=mergenode.next;
            }
            current.val=sum;
            mergenode=mergenode.next;
            if(mergenode!=null)
            {
                current.next=mergenode;
                current=current.next;
            }
          
        }
        current.next=null;
        return head.next;
        
    }
}