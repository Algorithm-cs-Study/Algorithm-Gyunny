package study.lv1;

import java.util.Scanner;

public class _03하샤드수 {

    public static void main(String[] args) {
        _03하샤드수 t = new _03하샤드수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public boolean solution(int n) {
        int sum = 0;
        String[] str = Integer.toString(n).split("");
        for (String x : str) {
            sum += Integer.parseInt(x);
        }

        return n % sum == 0;
    }

}