package study2.그리디;

import java.util.Arrays;
import java.util.Stack;

public class _003큰수만들기 {

    public static void main(String[] args) {
        _003큰수만들기 t = new _003큰수만들기();
        String number = "1924";
        int k = 2;
        System.out.println(t.solution(number, k));
    }

    public String solution(String number, int k) {
        int number_length = number.length();

        // 결과 문자열의 길이를 계산  (원래 문자열의 길이 - 제거할 숫자의 개수)
        char[] result = new char[number_length - k];
        // 스택을 사용하여 큰 숫자를 유지
        Stack<Character> stack = new Stack<>();

        // 주어진 숫자 문자열을 순회
        for (int i = 0; i < number_length; i++) {
            char c = number.charAt(i);

            // 스택이 비어있지 않고, 스택의 top이 현재 숫자보다 작고, 아직 제거할 숫자가 남아있는 경우
            while (!stack.isEmpty() && stack.peek() < c && k > 0) {
                stack.pop();
                k--;
            }

            // 모든 숫자를 제거했거나, 더 이상 제거할 숫자가 없는 경우
            if (k == 0) {
                // 남은 숫자들을 스택에 추가
                number = number.substring(i);
                for (int j = 0; j < number.length(); j++) {
                    stack.push(number.charAt(j));
                }
                break;
            }

            // 현재 숫자를 스택에 추가
            stack.push(c);
        }

        // 남은 제거할 숫자가 있다면 스택에서 제거
        while (k > 0) {
            stack.pop();
            k--;
        }

        // 결과 배열에 스택의 요소를 저장
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
            sb.append(result[i]);
        }

        return sb.toString();
    }

}