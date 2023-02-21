package study.lv1;

import java.util.Scanner;

public class _16약수의개수와덧셈 {

    public static void main(String[] args) {
        _16약수의개수와덧셈 t = new _16약수의개수와덧셈();
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        System.out.println(t.solution(left, right));
    }

    public int solution(int left, int right) {
        int answer = 0;
        int max = Math.max(left, right);
        int min = Math.min(left, right);

        for (int i = min; i <= max; i++) {
            int cnt = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            if (cnt % 2 == 0) answer += i;
            else answer -= i;

        }
        return answer;
    }

}