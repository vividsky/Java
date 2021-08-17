package Stack;

public class NextGreaterElement {
    public static void main(String[] args) throws Exception {
        StackUsingArrays<Integer> stack = new StackUsingArrays<>(5);
        int[] arr = {2, 1, 3, 8, 6, 7, 5};
        nextGreaterElement(arr, stack);
    }
    public static void nextGreaterElement(int[] arr, StackUsingArrays<Integer> stack) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > stack.top()) {
                System.out.println(stack.pop() + "-> " + arr[i]);
            }
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + "-> " + -1);
        }
    }
}
