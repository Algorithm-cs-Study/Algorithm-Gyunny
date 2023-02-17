package study.lv1;

import java.util.Scanner;

public class _02나머지1이되는수찾기 {

    public static void main(String[] args) {
        _02나머지1이되는수찾기 t = new _02나머지1이되는수찾기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        int x = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                x = i;
                break;
            }
        }
        return x;
    }

}