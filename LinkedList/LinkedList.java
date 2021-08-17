package LinkedList;

public class LinkedList<T> {


    private class LLNode {
        T val;
        LLNode next;
        LLNode(T val) {
            this.val = val;
            this.next = null;
        }
    }
    private LLNode tail = null;
    private LLNode head = null;
    private int size = 0;

    public void addLast(T val) {
        LLNode temp = new LLNode(val);
        if (size == 0) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
        size++;
    }

    public void addFirst(T val) {
        LLNode temp = new LLNode(val);
        if (size == 0) {
            tail = temp;
        } else {
            temp.next = head;
        }
        head = temp;
        size++;
    }

    public T getFirst() throws Exception{
        if(size == 0) throw new Exception("LinkedList is empty!");
        return head.val;
    }
    private LLNode getNodeAt(int index) throws Exception{
        if (size == 0) throw new Exception("LinkedList is Empty!!!");
        if(index < 0 || index >= size) throw new Exception("Index out of bound.");
        int i = 0;
        LLNode temp = head;
        while (i != index) {
            temp = temp.next;
            i++;
        }
        return temp;
    }
    public T getAt(int index) throws Exception{
        return getNodeAt(index).val;
    }
    public void addAt(int index, T val) throws Exception {
        if(index < 0 || index > size) throw new Exception("Invalid Index.");
        if(index == 0) {
            addFirst(val);
        } else if(index == size ) {
            addLast(val);
        } else {
            LLNode node = new LLNode(val);
            LLNode before = getNodeAt(index - 1);
            LLNode after = before.next;
            before.next = node;
            node.next = after;
            size++;
        }
    }

    public T getLast() throws Exception{
        if(size == 0) throw new Exception("LinkedList is Empty!!!");
        return tail.val;
    }

    public T removeLast() throws Exception{
        if(size == 0) throw new Exception("LinkedList is Empty!!!");
        if(size == 1) {
            return removeFirst();
        }
        LLNode temp = getNodeAt(size - 2);
        T val = tail.val;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public T removeFirst() throws Exception {
        if(size == 0) throw new Exception("LinkedList is empty!");
        LLNode temp = head;
        head = head.next;
        size--;
        return temp.val;
    }
    public T removeAt(int index) throws Exception {

        if(index < 0 || index >= size) {
            throw new Exception("Invalid Index");
        }
        if(size == 0) throw new Exception("LinkedList is Empty!!!");
        if (index == 0) {
            return removeFirst();
        }
        if(index == size - 1) {
            return removeLast();
        }

        LLNode before = getNodeAt(index - 1);
        LLNode node = before.next;
        T val = node.val;
        before.next = node.next;
        size--;
        return val;
    }

    public void reverseData() throws Exception {
         int l = 0;
         int r = size - 1;
         while (l < r) {
             LLNode left = getNodeAt(l);
             LLNode right = getNodeAt(r);
             T temp = left.val;
             left.val = right.val;
             right.val = temp;
             l++;
             r--;
         }
    }
    public void reversePointers() {
        LLNode previous = head;
        LLNode current = previous.next;

        while(current != null) {
            LLNode ahead = current.next;
            current.next = previous;
            previous = current;
            current = ahead;
        }
        LLNode temp = tail;
        tail = head;
        head = temp;
        tail.next = null;
    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public T getMid() {
        LLNode fast_pointer = head;
        LLNode slow_pointer = head;
        while(fast_pointer != null && fast_pointer.next != null) {
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
        }
        return slow_pointer.val;
    }
    public T kNodeFromEnd(int k) {
           LLNode slow = head;
           LLNode fast = head;
           while(k > 0) {
               fast = fast.next;
               k--;
           }
           while(fast != null) {
               slow = slow.next;
               fast = fast.next;
           }
           return slow.val;
    }


    public void display() {
        LLNode temp = this.head;
        StringBuilder sb = new StringBuilder();
        while(temp != null) {
            sb.append(temp.val + ", ");
            temp = temp.next;
        }
        System.out.println(sb);
    }
}
