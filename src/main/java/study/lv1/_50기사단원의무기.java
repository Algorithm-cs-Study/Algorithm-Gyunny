package study.lv1;

import java.util.ArrayList;

public class _50기사단원의무기 {

    public static void main(String[] args) {
        _50기사단원의무기 t = new _50기사단원의무기();
        int number = 10;
        int limit = 3;
        int power = 2;
        System.out.println(t.solution(number, limit, power));
    }

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                    if (cnt > limit) {
                        cnt = power;
                        break;
                    }
                }
            }
            answer += cnt;
            cnt = 0;
        }

        return answer;
    }

}