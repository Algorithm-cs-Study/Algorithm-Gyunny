package study.lv1;

import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args) {
        StringToInteger t = new StringToInteger();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public int solution(String s) {
        return Integer.parseInt(s);
    }

}