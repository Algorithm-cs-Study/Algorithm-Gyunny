package study.lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class _20직사각형별찍기 {

    public static void main(String[] args) {
        _20직사각형별찍기 t = new _20직사각형별찍기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (String x : t.solution(n, m)) {
            System.out.println(x);
        }
    }

    public ArrayList<String> solution(int n, int m) {
        ArrayList<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sb.append("*");
            }
            answer.add(sb.toString());
            sb = new StringBuilder();
        }

        return answer;
    }

}