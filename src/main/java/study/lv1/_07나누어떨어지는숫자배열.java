package study.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _07나누어떨어지는숫자배열 {

    public static void main(String[] args) {
        _07나누어떨어지는숫자배열 t = new _07나누어떨어지는숫자배열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int divisor = sc.nextInt();
        for (int x : t.solution(arr, divisor)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        for (int x : arr) {
            if (x % divisor == 0) {
                answer.add(x);
            }
        }

        if (answer.isEmpty()) {
            answer.add(-1);
        }

        return answer;
    }

}