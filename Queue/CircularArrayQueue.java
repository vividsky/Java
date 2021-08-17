package Queue;

public class CircularArrayQueue<E> {
    private static int default_size = 5;
    private int front;
    private int size ;
    private int ms;
    private int rear;
    private E[] queue;

    CircularArrayQueue(int capacity) {
        queue = (E[]) new Object[capacity];
        front = -1;
        ms = capacity;
    }

    CircularArrayQueue() {
        this(default_size);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == this.ms;
    }

     public void enqueue(E ele) throws Exception{
        if (isFull()) throw new Exception("Queue is full!!");
        queue[rear] = ele;
        size++;
        rear = (rear + 1) % queue.length;
        if (front == -1) front = 0;
     }

     public E dequeue() throws Exception{
        if (isEmpty()) throw new Exception("Queue is Empty!!");
        E ele = queue[front];
        size--;
        front = (front + 1) % this.queue.length;
        if (isEmpty()) front = -1;
        return ele;
     }
     public E getFront() throws Exception{
        if(isEmpty()) throw new Exception("Queue is Empty!!");
        return queue[front];
     }
}
