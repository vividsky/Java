package Stack;

import java.util.Stack;

public class CheckParanthesis {
    public static void main(String[] args) {
        String str = "{2+3+[(4*2) + 1]}";
        System.out.println(checkParenthesis(str));
    }
    public static boolean checkParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[' ) {
                stack.push(str.charAt(i));
            }
            else if (str.charAt(i) == '}' && (stack.isEmpty() || '{' != stack.pop()) )  return false;
            else if ( str.charAt(i) == ']' && (stack.isEmpty() || '[' != stack.pop()) )  return false;
            else if ( str.charAt(i) == ')' && (stack.isEmpty() || '(' != stack.pop()) )  return false;
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
