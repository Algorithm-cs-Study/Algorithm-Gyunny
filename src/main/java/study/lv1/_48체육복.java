package study.lv1;

import java.util.Arrays;

public class _48체육복 {

    public static void main(String[] args) {
        _48체육복 t = new _48체육복();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(t.solution(n, lost, reserve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int cnt = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    cnt++;
                    break;
                }
            }
        }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
                    cnt++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return n - lost.length + cnt;
    }

}