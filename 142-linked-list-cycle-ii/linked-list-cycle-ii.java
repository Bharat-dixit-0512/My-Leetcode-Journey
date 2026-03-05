public class Solution {
    public ListNode detectCycle(ListNode head) {
       HashSet<ListNode>s=new HashSet<>();
        while(head!=null){
            if(s.contains(head)==true)return head;
            s.add(head);
            head=head.next;
        }
        return null;
    }
}