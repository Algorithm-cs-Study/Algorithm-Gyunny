package study.lv1;

public class _40소수찾기 {

    public static void main(String[] args) {
        _40소수찾기 t = new _40소수찾기();
        int n = 5;
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                answer++;
            }
        }

        return answer;
    }
}