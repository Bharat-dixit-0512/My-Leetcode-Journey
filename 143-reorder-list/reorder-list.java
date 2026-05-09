class Solution {
    public void reorderList(ListNode head) {
        if (head == null) return;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int arr[] = new int[list.size()];
        int j = 0;
        for (int i = 0; i < list.size(); i += 2) {
            arr[i] = list.get(j++);
        }
        j = list.size() - 1;
        for (int i = 1; i < list.size(); i += 2) {
            arr[i] = list.get(j--);
        }
        temp = head;
        for (int val : arr) {
            temp.val = val;
            temp = temp.next;
        }
    }
}
