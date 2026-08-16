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
    public ListNode swapPairs(ListNode head) {

        int len=0;
        ListNode cur=head;

        while(cur!=null)
        {
            len++;
            cur=cur.next;
        }

        if(len%2!=0)
        {
            len=len-1;
        }

        ListNode cur2=head;
        ListNode prev=null;

        for(int i=1;i<len;i+=2)
        {
            // ListNode temp=cur2;
            ListNode next=cur2.next;

            cur2.next=next.next;
            next.next=cur2;

            if(prev==null)
            {
                head=next;
            }
            else
            {
                prev.next=next;
            }

            prev=cur2;
            cur2=cur2.next;
        }

        return head;
    }
}