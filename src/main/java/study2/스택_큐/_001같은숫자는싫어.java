package study2.스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class _001같은숫자는싫어 {

    public static void main(String[] args) throws IOException {
        _001같은숫자는싫어 t = new _001같은숫자는싫어();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(t.solution(arr)));
    }

    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        int len = arr.length;
        /**
         * 두 번째 숫자부터 마지막 까지 순회하며, 스택의 맨 위에 있는 숫자와 다르다면 스택에 삽입
         */
        for (int i = 1; i < len; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        /**
         * 결과를 담을 배열을 생성, 스택에 있는 숫자를 순서대로 삽입
         */
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }

}