package study.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15N개의최소공배수 {

    public static void main(String[] args) throws IOException {
        _15N개의최소공배수 t = new _15N개의최소공배수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int[] arr = new int[st.countTokens()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print(t.solution(arr));
    }

    public int solution(int[] arr) {
        int answer = 0;

        if (arr.length == 1) {
            return arr[0];
        }

        int gcd = gcd(arr[0], arr[1]);
        answer = (arr[0] * arr[1]) / gcd;

        if (arr.length > 2) {
            for (int i = 2; i < arr.length; i++) {
                gcd = gcd(answer, arr[i]);
                answer = (answer * arr[i]) / gcd;
            }
        }

        return answer;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}