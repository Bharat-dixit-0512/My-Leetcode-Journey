class MyLinkedList {
    List<Integer> list;
    public MyLinkedList() {
        list = new ArrayList<>();
    }
    
    public int get(int index) {
        if(list.size() > index) return list.get(index);
        else return -1;
    }
    
    public void addAtHead(int val) {
        list.add(0, val);
    }
    
    public void addAtTail(int val) {
        list.add(val);
    }
    
    public void addAtIndex(int index, int val) {
       if(index < list.size()) list.add(index, val);
       else if(index == list.size()) list.add(val);
    }
    
    public void deleteAtIndex(int index) {
        if(list.size() > index) list.remove(index);
    }
}