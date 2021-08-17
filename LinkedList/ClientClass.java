package LinkedList;

public class ClientClass {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.addLast(23);
        ll.addLast(13);
        ll.addLast(3);
        ll.addLast(22);
        ll.addLast(55);
        ll.addLast(65);
        ll.addAt(0, 1000);

        ll.display();
//        ll.reversePointers();
//        ll.display();
//        System.out.println(ll.getMid());
        System.out.println(ll.kNodeFromEnd(1));

        LLAsQueue queue = new LLAsQueue();
        queue.enqueue(234);
        queue.enqueue(134);
        queue.enqueue(334);

//        queue.display();


    }
}
