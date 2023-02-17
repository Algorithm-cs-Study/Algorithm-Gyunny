package study.lv1;

import java.util.Scanner;

public class AddDigits {

    public static void main(String[] args) {
        AddDigits t = new AddDigits();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        int sum = 0;
        String[] s = String.valueOf(n).split("");
        for (String x : s) {
            sum += Integer.parseInt(x);
        }
        return sum;
    }

}