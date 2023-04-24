package study.lv2;

public class _08피보나치수 {

    public static void main(String[] args) {
        _08피보나치수 t = new _08피보나치수();
        int n = 3;
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        int[] answer = new int[n + 1];
        answer[0] = 0;
        answer[1] = 1;

        for (int i = 2; i <= n; i++) {
            int sum = answer[i - 2] + answer[i - 1];
            answer[i] = sum % 1234567;
        }

        return answer[n];
    }

}