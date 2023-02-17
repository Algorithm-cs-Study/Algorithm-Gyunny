package study.lv1;

import java.util.Scanner;

public class _06서울에서김서방찾기 {

    public static void main(String[] args) {
        _06서울에서김서방찾기 t = new _06서울에서김서방찾기();
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        System.out.println(t.solution(s));
    }

    public String solution(String[] seoul) {
        int cnt = 0;
        for (String x : seoul) {
            if (x.equals("Kim")) {
                break;
            }
            cnt++;
        }
        return "김서방은 " + cnt + "에 있다";
    }

}