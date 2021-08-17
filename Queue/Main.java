package Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularArrayQueue<Integer> queue = new CircularArrayQueue<>();
        System.out.println(queue.size());
        queue.enqueue(12);
        queue.enqueue(23);
        queue.enqueue(24);
        queue.enqueue(25);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(26);
        queue.enqueue(27);
        queue.enqueue(28);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());



    }
}
