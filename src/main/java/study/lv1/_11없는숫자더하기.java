package study.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class _11없는숫자더하기 {

    public static void main(String[] args) {
        _11없는숫자더하기 t = new _11없는숫자더하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(t.solution(numbers));
    }

    public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

}