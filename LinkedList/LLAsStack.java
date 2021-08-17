package LinkedList;
interface stack{
    public int size();
    public int pop() throws Exception;
    public void push(int val);
    public boolean isEmpty();
    public int top() throws Exception;
    public void display();

}

public class LLAsStack implements  stack {

    private static LinkedList<Integer> stack;
    LLAsStack() {
        this.stack = new LinkedList<Integer>();
    }

    @Override
    public int size() {
        return stack.size() ;
    }

    @Override
    public int pop() throws Exception {
        return stack.removeLast();
    }

    @Override
    public void push(int val) {
        stack.addLast(val);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int top() throws Exception {
        return stack.getLast();
    }

    @Override
    public void display() {
        stack.display();
    }
}
