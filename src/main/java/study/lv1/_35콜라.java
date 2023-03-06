package study.lv1;

public class _35콜라 {

    public static void main(String[] args) {
        _35콜라 t = new _35콜라();
        int a = 3;
        int b = 1;
        int n = 20;
        System.out.print(t.solution(a, b, n));
    }

    public int solution(int a, int b, int n) {
        int cnt = 0;
        while (n >= a) {
            n = n - a + b;
            cnt += b;
        }

        return cnt;
    }

}