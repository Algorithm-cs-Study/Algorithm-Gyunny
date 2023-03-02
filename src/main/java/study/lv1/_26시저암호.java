package study.lv1;

import java.util.Scanner;

public class _26시저암호 {

    public static void main(String[] args) {
        _26시저암호 t = new _26시저암호();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(t.solution(s, n));
    }

    public StringBuilder solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char x : chars) {
            if (x == ' ') {
                sb.append(x);
            } else if (x >= 'a' && x <= 'z') {
                sb.append((char) ('a' + (x + n - 'a') % 26));
            } else {
                sb.append((char) ('A' + (x + n - 'A') % 26));
            }
        }

        return sb;
    }

}