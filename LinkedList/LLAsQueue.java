package LinkedList;
interface Queue {
    public void enqueue(int val);
    public int dequeue() throws Exception;
    public int front() throws Exception;
    public int size();
    public boolean isEmpty();
    public void display();
}

public class LLAsQueue implements Queue {
    private static LinkedList<Integer> queue;
    LLAsQueue() {

        this.queue = new LinkedList<Integer>();
    }

    @Override
    public void enqueue(int val) {
        queue.addLast(val);
    }

    @Override
    public int dequeue() throws Exception {
        return queue.removeFirst();
    }

    @Override
    public int front() throws Exception {
        return queue.getFirst();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void display() {
        queue.display();
    }
}
