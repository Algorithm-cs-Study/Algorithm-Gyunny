package study.lv2;

public class _06숫자의표현 {

    public static void main(String[] args) {
        _06숫자의표현 t = new _06숫자의표현();
        int n = 15;
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        int sum;
        int rt;

        for (int i = 1; i <= n; i++) {
            sum = 0;
            rt = i;
            while (sum <= n) {
                sum += rt;
                rt++;
                if (sum == n) {
                    answer++;
                }
            }

        }

        return answer;
    }

}