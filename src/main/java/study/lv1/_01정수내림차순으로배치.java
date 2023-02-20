package study.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _01정수내림차순으로배치 {

    public static void main(String[] args) {
        _01정수내림차순으로배치 t = new _01정수내림차순으로배치();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(t.solution(n));
    }

    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String[] s = String.valueOf(n).split("");
        Arrays.sort(s, Collections.reverseOrder());
        for (String x : s) {
            sb.append(x);
        }

        return Long.parseLong(sb.toString());
    }

}