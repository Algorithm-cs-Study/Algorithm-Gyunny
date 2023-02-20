package study.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _09제일작은수제거하기 {

    public static void main(String[] args) {
        _09제일작은수제거하기 t = new _09제일작은수제거하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : t.solution(arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        if (arr.length < 2) {
            answer.add(-1);
            return answer;
        }

        int min = Arrays.stream(arr).min().getAsInt();
        for (int x : arr) {
            if (x != min) {
                answer.add(x);
            }
        }
        return answer;
    }

}