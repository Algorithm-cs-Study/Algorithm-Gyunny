package study2.스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class _006주식가격 {

    public static void main(String[] args) throws IOException {
        _006주식가격 t = new _006주식가격();
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
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        return answer;
    }

}