package study.lv1;

import java.util.Scanner;

public class _08핸드폰번호가리기 {

    public static void main(String[] args) {
        _08핸드폰번호가리기 t = new _08핸드폰번호가리기();
        Scanner sc = new Scanner(System.in);
        String phone_number = sc.next();
        System.out.println(t.solution(phone_number));
    }

    public String solution(String phone_number) {
        String answer = "";
        int cnt = 0;
        char[] chars = phone_number.toCharArray();
        for (char x : chars) {
            if (cnt < phone_number.length() - 4) {
                answer += "*";
                cnt++;
            } else {
                answer += x;
            }
        }
        return answer;
    }

}