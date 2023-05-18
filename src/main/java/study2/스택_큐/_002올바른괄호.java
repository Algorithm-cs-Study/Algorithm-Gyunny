package study2.스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _002올바른괄호 {

    public static void main(String[] args) throws IOException {
        _002올바른괄호 t = new _002올바른괄호();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(t.solution(s));
    }

    public boolean solution(String s) {
        /**
         * 문자열을 검사하기 위한 스택
         */
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ')') {
                /**
                 * 스택이 비어있다면 올바르지 않은 괄호를 나타내므로 false 를 반환
                 */
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
            if (s.charAt(i) == '(') {
                stack.push('(');
            }
        }

        return stack.isEmpty();
    }

}