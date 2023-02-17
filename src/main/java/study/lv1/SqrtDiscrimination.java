package study.lv1;

import java.util.Scanner;

public class SqrtDiscrimination {

    public static void main(String[] args) {
        SqrtDiscrimination t = new SqrtDiscrimination();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(t.solution(n));
    }

    public long solution(long n) {
        return Math.pow((long) Math.sqrt(n), 2) == n ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }

}