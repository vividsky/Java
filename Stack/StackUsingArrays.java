package Stack;

public class StackUsingArrays<E> {

    protected int top;
    protected static int default_length = 10;
    protected E[] stack;

    public StackUsingArrays(int capacity) {
        this.stack = (E[]) new Object[capacity];
        this.top = -1;
    }

    public StackUsingArrays() {

        this(default_length);
    }

    public int size() {
        return this.top + 1;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void push(E obj) throws Exception {
        if (this.size() == stack.length) throw new Exception("Stack is Full!");
        top++;
        this.stack[this.top] = obj;
    }

    public E pop() throws Exception {
        if (this.isEmpty()) throw new Exception("Stack is Empty!");
        E temp = this.stack[this.top];
        this.stack[this.top] = null;
        top--;
        return temp;
    }

    public E top() throws Exception {
        if (this.isEmpty()) throw new Exception("Stack is Empty!");
        return stack[this.top];
    }

    public void display() {
        for (int i = this.top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println("END");
    }
}
