class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> ans=new ArrayList<>();
        for(ListNode head :lists){
            while(head!=null){
                ans.add(head.val);
                head = head.next;
            }
        }
        Collections.sort(ans);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int i:ans){
            current.next = new ListNode(i);
            current = current.next;
        }
        return dummy.next;
    }
}