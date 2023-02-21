package study.lv1;

import java.util.Scanner;

public class _13수박수박수박수박수 {

    public static void main(String[] args) {
        _13수박수박수박수박수 t = new _13수박수박수박수박수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public StringBuilder solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }

        return sb;
    }

}