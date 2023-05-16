package study.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16멀리뛰기 {

    public static void main(String[] args) throws IOException {
        _16멀리뛰기 t = new _16멀리뛰기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(t.solution(n));
    }

    public long solution(int n) {
        int[] arr = new int[2001];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i < 2001; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 1234567;
        }
        return arr[n];
    }

}