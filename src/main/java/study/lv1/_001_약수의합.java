package study.lv1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class _001_약수의합 {

    public static void main(String[] args) {
        _001_약수의합 t = new _001_약수의합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
        System.out.println(t.solution2(n));
    }

    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int solution2(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
    }

}