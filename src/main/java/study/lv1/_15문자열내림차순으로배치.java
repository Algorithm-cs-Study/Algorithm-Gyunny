package study.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class _15문자열내림차순으로배치 {

    public static void main(String[] args) {
        _15문자열내림차순으로배치 t = new _15문자열내림차순으로배치();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(String.valueOf(chars)).reverse().toString();
    }

}
