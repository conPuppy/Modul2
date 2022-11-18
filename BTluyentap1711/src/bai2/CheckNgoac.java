package bai2;

import java.util.Stack;

public class CheckNgoac {
    public static void main(String[] args) {
        String string = ")()()()";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                stack.push('(');
            } else if (string.charAt(i) == ')') {
                if (stack.size() > 0 && stack.peek().equals('(')) {
                    stack.pop();
                } else stack.push(')');
            }
        }
        if (stack.size() != 0) {
            System.out.println("Sai");
        } else System.out.println("Đúng");

    }

}
