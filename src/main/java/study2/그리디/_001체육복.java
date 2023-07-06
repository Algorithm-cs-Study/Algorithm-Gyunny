package study2.그리디;

import java.util.Arrays;

public class _001체육복 {

    public static void main(String[] args) {
        _001체육복 t = new _001체육복();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};
        System.out.print(t.solution(n, lost, reserve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int count = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        int lost_length = lost.length;
        int reserve_length = reserve.length;

        for (int i = 0; i < lost_length; i++) {
            for (int j = 0; j < reserve_length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }

        for (int i = 0; i < lost_length; i++) {
            for (int j = 0; j < reserve_length; j++) {
                if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
                    count++;
                    reserve[j] = -1;
                    break;

                }
            }
        }

        return n - lost.length + count;
    }

}