class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null)
        {
            return head;
        }

        int len=1;
        ListNode cur=head;

        while(cur.next!=null)
        {
            len++;
            cur=cur.next;
        }

        k = k % len;

        if(k == 0)
        {
            return head;
        }

        int req=len-k;
        ListNode cur2=head;
        for(int i=1;i<req;i++)
        {
            cur2=cur2.next;
        }
        ListNode f=cur2.next;
        cur2.next=null;
        cur.next=head;
        return f;

    }
}