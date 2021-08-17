package Stack;

public class ReverseStack {
    public static void main(String[] args) throws Exception {
        StackUsingArrays<Integer> stack = new StackUsingArrays<>(5);
        for (int i = 1; i <= 5; i++) {
            stack.push(i * 10);
        }
        stack.display();
        StackUsingArrays<Integer> helper = new StackUsingArrays<>(5);
        recursiveReverseStack(stack, helper, 0);
        stack.display();
    }
    public static void reverseStack(StackUsingArrays<Integer> stack, StackUsingArrays<Integer> helper) throws Exception {
        while (stack.size() != 0) {
            int temp = stack.pop();
            while (!helper.isEmpty() && helper.top() > temp) {
                stack.push(helper.pop());
            }
            helper.push(temp);
        }
        while (!helper.isEmpty()) {
            stack.push(helper.pop());
        }
    }
    public static void recursiveReverseStack(StackUsingArrays<Integer> stack, StackUsingArrays<Integer> helper, int index) throws Exception {

        if (stack.size() == 0) return;
        int temp = stack.pop();
        recursiveReverseStack(stack, helper, index + 1);
        helper.push(temp);
        if (index == 0) {
            while (!helper.isEmpty()) {
                stack.push(helper.pop());
            }
        }
    }
}
