package study.lv2;

import java.util.Stack;

public class _09짝지어제거하기 {

    public static void main(String[] args) {
        _09짝지어제거하기 t = new _09짝지어제거하기();
        String s = "baabaa";
        System.out.println(t.solution(s));
    }

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == x) {
                stack.pop();
            } else {
                stack.push(x);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

}