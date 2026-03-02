class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head.next==null || head==null)return head;

        ListNode next=removeNodes(head.next);

        if(next.val>head.val)return next;
        else{
            head.next=next;
            return head;
        }
    }
}