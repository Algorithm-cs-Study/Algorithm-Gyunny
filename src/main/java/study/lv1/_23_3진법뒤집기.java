package study.lv1;

import java.util.Scanner;

public class _23_3진법뒤집기 {

    public static void main(String[] args) {
        _23_3진법뒤집기 t = new _23_3진법뒤집기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        String s = Integer.toString(Integer.parseInt(String.valueOf(n)), 3);
        String str = new StringBuilder(s).reverse().toString();
        return Integer.parseInt(str, 3);
    }

}