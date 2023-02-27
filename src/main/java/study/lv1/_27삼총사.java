package study.lv1;

import java.util.Scanner;

public class _27삼총사 {

    public static void main(String[] args) {
        _27삼총사 t = new _27삼총사();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println(t.solution(number));
    }

    public int solution(int[] number) {
        int cnt = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

}