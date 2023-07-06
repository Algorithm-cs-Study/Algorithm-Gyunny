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
        // 체육복을 빌려준 횟수를 기록하기 위한 count 변수 초기화
        int count = 0;
        // lost, reserve 배열 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        int lost_length = lost.length;
        int reserve_length = reserve.length;

        // 체육복을 잃어버렸지만 여분의 체육복을 가진 학생 count 후, lost 와 reserve에서 제거
        for (int i = 0; i < lost_length; i++) {
            for (int j = 0; j < reserve_length; j++) {
                // 잃어버린 학생과 여분의 체육복을 가진 학생이 일치하는 경우
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    count++;

                    break;
                }
            }
        }

        // 잃어버린 학생이 양 옆 학생으로부터 체육복을 빌릴 수 있는 경우 count 증가
        for (int i = 0; i < lost_length; i++) {
            for (int j = 0; j < reserve_length; j++) {
                // 잃어버린 학생의 번호와 여분의 체육복을 가진 학생의 번호가 1 차이나는 경우
                if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
                    // 해당 학생은 체육복을 빌려줬으므로, reserve에서 제외시키고 count 증가
                    count++;
                    reserve[j] = -1;

                    break;
                }
            }
        }

        return n - lost.length + count;
    }

}