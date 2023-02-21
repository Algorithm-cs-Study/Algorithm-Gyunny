package study.lv1;

import java.util.Scanner;

public class _17문자열다루기기본 {

    public static void main(String[] args) {
        _17문자열다루기기본 t = new _17문자열다루기기본();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public boolean solution(String s) {
        char[] chars = s.toCharArray();
        if (s.length() == 4 || s.length() == 6) {
            for (char x : chars) {
                if (!Character.isDigit(x)) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

}