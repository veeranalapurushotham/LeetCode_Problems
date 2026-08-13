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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode node1=head;
        while(node1!=null)
        {
            len++;
            node1=node1.next;
        }
        if(len==n)
        {
            return head.next;
        }
        node1=head;
        for(int i=1;i<(len-n);i++)
        {
            node1=node1.next;
        }
        node1.next=node1.next.next;
        return head;
    }
}