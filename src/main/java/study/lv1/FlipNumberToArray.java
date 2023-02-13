package study.lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class FlipNumberToArray {

    public static void main(String[] args) {
        FlipNumberToArray t = new FlipNumberToArray();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(t.solution(n));
    }

    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] str = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        for (String x : str) {
            answer.add(Integer.parseInt(x));
        }
        return answer;
    }

}