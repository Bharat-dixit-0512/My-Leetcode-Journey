class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> element=new ArrayList();
        while(head!=null){
            element.add(head.val);
            head=head.next;
        }
        ListNode sort=new ListNode(0);
        ListNode ptr=sort;
        Collections.sort(element);
        for(int i=0;i<element.size();i++){
            ptr.next=new ListNode(element.get(i));
            ptr=ptr.next;
        }
        return sort.next;
    }
}