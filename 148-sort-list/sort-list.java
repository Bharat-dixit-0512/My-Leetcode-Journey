class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null)return null;
        int count=0;
        ListNode length=head;
        while(length!=null){
            length=length.next;
            count++;
        }
        int arr[]=new int[count];
        int i=0;
        ListNode curr=head;
        while(curr!=null){
            arr[i]=curr.val;
            curr=curr.next;
            i++;
        }
        Arrays.sort(arr);
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        for(int j:arr){
            temp.next=new ListNode(j);
            temp=temp.next;
        }
        return dummy.next;
        
    }
}