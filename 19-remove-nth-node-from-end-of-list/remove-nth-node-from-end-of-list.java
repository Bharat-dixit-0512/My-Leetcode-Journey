class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int pos = length - n;
        if (pos == 0)
            return head.next;
        else{
            temp = head;
            for (int i = 0; i < pos-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        return head;
    }
}