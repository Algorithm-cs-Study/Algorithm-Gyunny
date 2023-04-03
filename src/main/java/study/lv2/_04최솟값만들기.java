package study.lv2;

import java.util.Arrays;

public class _04최솟값만들기 {

    public static void main(String[] args) {
        _04최솟값만들기 t = new _04최솟값만들기();
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};
        System.out.println(t.solution(a, b));
    }

    public int solution(int[] a, int[] b) {
        int answer = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[b.length - 1 - i];
        }

        return answer;
    }

}