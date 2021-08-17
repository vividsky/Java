package Stack;

public class DynamicStack<E> extends StackUsingArrays<E> {

    public DynamicStack() {
        this(default_length);
    }
    public DynamicStack(int capacity) {
        super(capacity);
    }
    @Override
    public void push(E obj) throws Exception {
         try {
             super.push(obj);
         } catch(Exception e) {
             E[] s = (E[]) new Object[2*this.stack.length];
             for (int i = 0; i < this.stack.length; i++) {
                 s[i] = this.stack[i];
             }
             this.stack = s;
             super.push(obj);
        }
    }
}
