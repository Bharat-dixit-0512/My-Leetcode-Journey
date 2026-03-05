class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        Collections.reverse(list);
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        for (int i = 0; i < list.size(); i++) {
            prev.next = new ListNode(list.get(i));
            prev = prev.next;
        }
        return dummy.next;
    }
}