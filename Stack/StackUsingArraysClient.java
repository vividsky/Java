package Stack;

public class StackUsingArraysClient {
    public static void main(String[] args) throws Exception {
        StackUsingArrays<Integer> stack = new DynamicStack<>(3);
        System.out.println(stack.size());
        System.out.println(stack.top());
        stack.push(21);
        System.out.println(stack.top());
        stack.push(23);
        System.out.println(stack.top());
        stack.push(45);
        System.out.println(stack.size());
            stack.push(55);
        System.out.println(stack.top());
        stack.display();
    }
}
