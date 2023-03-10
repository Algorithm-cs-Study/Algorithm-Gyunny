package study.lv1;

import java.util.Scanner;

public class _31숫자문자열과영단어 {

    public static void main(String[] args) {
        _31숫자문자열과영단어 t = new _31숫자문자열과영단어();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public int solution(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replace(num[i], Integer.toString(i));
        }

        int answer = Integer.parseInt(s);

        return answer;
    }

}