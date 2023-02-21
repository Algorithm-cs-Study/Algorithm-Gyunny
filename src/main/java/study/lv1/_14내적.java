package study.lv1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class _14내적 {

    public static void main(String[] args) {
        _14내적 t = new _14내적();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        System.out.println(t.solution(a, b));
    }

    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
    }

}