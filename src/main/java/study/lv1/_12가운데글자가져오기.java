package study.lv1;

import java.util.Scanner;

public class _12가운데글자가져오기 {

    public static void main(String[] args) {
        _12가운데글자가져오기 t = new _12가운데글자가져오기();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() % 2 == 0) {
            sb.append(s.substring(s.length() / 2 - 1, s.length() / 2 + 1));
        } else {
            sb.append(s.substring(s.length() / 2, s.length() / 2 + 1));
        }
        return sb.toString();
    }

}