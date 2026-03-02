class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        Map<Integer, Integer> freq = new HashMap<>();
        ListNode curr = head;
        while (curr != null) {
            freq.put(curr.val, freq.getOrDefault(curr.val, 0) + 1);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        curr = head;
        while (curr != null) {
            if (freq.get(curr.val) == 1) {
                prev.next = curr;
                prev = prev.next;
            }
            curr = curr.next;
        }
        prev.next = null; 
        return dummy.next;
    }
}