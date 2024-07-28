package leet.code.blind75;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.empty()) {
                stack.push(ch);
            } else if (stack.peek() == '{' && ch == '}' || stack.peek() == '[' && ch == ']' || stack.peek() == '(' && ch == ')') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String str = "()[";
        System.out.println(isValid(str));
    }
}
