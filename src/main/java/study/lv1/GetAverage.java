package study.lv1;

import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args) {
        GetAverage t = new GetAverage();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(arr));
    }

    public double solution(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum / arr.length;
    }

}