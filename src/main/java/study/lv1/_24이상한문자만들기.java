package study.lv1;

import java.util.Scanner;

public class _24이상한문자만들기 {

    public static void main(String[] args) {
        _24이상한문자만들기 t = new _24이상한문자만들기();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("");
        int idx = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) {
                sb.append(" ");
                idx = 0;
            } else {
                sb.append(idx++ % 2 == 0 ? String.valueOf(str[i]).toUpperCase() : String.valueOf(str[i]).toLowerCase());
            }
        }

        return sb.toString();
    }

}