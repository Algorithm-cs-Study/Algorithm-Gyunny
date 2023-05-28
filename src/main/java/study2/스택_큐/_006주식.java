package study2.스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class _006주식 {

    public static void main(String[] args) throws IOException {
        _006주식 t = new _006주식();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] prices = new int[st.countTokens()];
        int len = prices.length;
        for (int i = 0; i < len; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print(Arrays.toString(t.solution(prices)));
    }

    public int[] solution(int[] prices) {
        int p_len = prices.length;
        int[] answer = new int[p_len];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < p_len; i++) {
            // 스택이 비지 않고, 현재 가격이 스택의 가장 위의 인덱스의 가격보다 작으면
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                // 가격이 떨어졌으니, 떨어지지 않은 기간을 계산하여 결과를 배열에 저장
                answer[stack.peek()] = i - stack.peek();
                // 계산이 끝난 인덱스는 스택에서 제거
                stack.pop();
            }
            // 현재 인덱스를 스택에 push
            stack.push(i);
        }
        // 모든 가격을 확인한 후에도 스택에 남아있는 인덱스가 있다면,
        while (!stack.isEmpty()) {
            // 끝까지 가격이 떨어지지 않았으니 전체 길이에서 현재 인덱스를 뺀 값이 떨어지지 않은 기간이 됨
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            // 계산이 끝난 인덱스는 스택에서 제거
            stack.pop();
        }

        return answer;
    }

}