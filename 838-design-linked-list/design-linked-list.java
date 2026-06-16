class MyLinkedList {
    Node head;
    int size;
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node curr = head;
        for (int i = 0; i < index; i++) curr = curr.next;
        return curr.val;
    }
    public void addAtHead(int val) {
        Node nNode = new Node(val);
        nNode.next = head;
        head = nNode;
        size++;
    }
    public void addAtTail(int val) {
        Node nNode = new Node(val);
        if (head == null) {
            head = nNode;
        } else {
            Node curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = nNode;
        }
        size++;
    }
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node curr = head;
        for (int i = 0; i < index - 1; i++) curr = curr.next;
        Node nNode = new Node(val);
        nNode.next = curr.next;
        curr.next = nNode;
        size++;
    }
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) curr = curr.next;
            curr.next = curr.next.next;
        }
        size--;
    }
}
