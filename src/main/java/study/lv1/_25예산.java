package study.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class _25예산 {

    public static void main(String[] args) {
        _25예산 t = new _25예산();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int budget = sc.nextInt();
        System.out.println(t.solution(d, budget));
    }

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int x : d) {
            budget -= x;
            if (budget < 0) {
                break;
            }
            answer++;
        }

        return answer;
    }

}