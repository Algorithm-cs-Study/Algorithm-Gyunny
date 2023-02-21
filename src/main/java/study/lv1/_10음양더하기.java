package study.lv1;

import java.util.Scanner;

public class _10음양더하기 {

    public static void main(String[] args) {
        _10음양더하기 t = new _10음양더하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] absolutes = new int[n];
        for (int i = 0; i < n; i++) {
            absolutes[i] = sc.nextInt();
        }
        boolean[] signs = new boolean[n];
        for (int i = 0; i < n; i++) {
            signs[i] = sc.nextBoolean();
        }
        System.out.println(t.solution(absolutes, signs));
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            sum += absolutes[i] * (signs[i] ? 1 : -1);
        }

        return sum;
    }

}