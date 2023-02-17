package study.lv1;

import java.util.Scanner;

public class _05콜라츠추측 {

    public static void main(String[] args) {
        _05콜라츠추측 t = new _05콜라츠추측();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public long solution(long n) {
        long answer = 0;
        while (n != 1) {
            answer++;
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;

            if (answer > 500) {
                return -1;
            }

        }

        return answer;
    }

}