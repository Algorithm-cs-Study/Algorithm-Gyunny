package study.lv1;

public class _40소수찾기 {

    public static void main(String[] args) {
        _40소수찾기 t = new _40소수찾기();
        int n = 20;
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        int[] chars = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (chars[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    chars[j] = 1;
                }
            }
        }

        return answer;
    }

}