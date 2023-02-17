package study.lv1;

import java.util.Scanner;

public class _04두정수사이의합 {

    public static void main(String[] args) {
        _04두정수사이의합 t = new _04두정수사이의합();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(t.solution(a, b));
    }

    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        return answer;
    }

}