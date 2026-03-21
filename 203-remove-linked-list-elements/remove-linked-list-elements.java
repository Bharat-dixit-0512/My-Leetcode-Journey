class Solution {
    public ListNode removeElements(ListNode head, int val) {
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        ListNode ans=new ListNode(0);
        ListNode ptr=ans;
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=val){
                ptr.next=new ListNode(list.get(i));
                ptr=ptr.next;
            }
        }
        return ans.next;
    }
}