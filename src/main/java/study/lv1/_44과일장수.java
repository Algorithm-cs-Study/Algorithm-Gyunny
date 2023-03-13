package study.lv1;

import java.util.Arrays;

public class _44과일장수 {

    public static void main(String[] args) {
        _44과일장수 t = new _44과일장수();
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(t.solution(k, m, score));
    }

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for (int i = score.length - 1; i >= 0; i -= m) {
            if (i - m + 1 >= 0) {
                answer += score[i - m + 1] * m;
            }
        }

        return answer;
    }

}