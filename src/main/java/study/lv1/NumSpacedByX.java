package study.lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class NumSpacedByX {

    public static void main(String[] args) {
        NumSpacedByX t = new NumSpacedByX();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(t.solution(x, n));
    }

    public ArrayList<Long> solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<>();
        long sum = x;
        for (int i = 0; i < n; i++) {
            answer.add(sum);
            sum += x;
        }
        return answer;
    }

}