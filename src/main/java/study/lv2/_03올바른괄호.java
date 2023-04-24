package study.lv2;

import java.util.Stack;

public class _03올바른괄호 {

    public static void main(String[] args) {
        _03올바른괄호 t = new _03올바른괄호();
        String s = "()()";
        System.out.print(t.solution(s));
    }

    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}