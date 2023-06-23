package study2.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _002가장큰수 {

    public static void main(String[] args) throws IOException {
        _002가장큰수 t = new _002가장큰수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[st.countTokens()];
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(t.solution(numbers));
    }

    public String solution(int[] numbers) {
        // 숫자 배열을 문자열 배열로 변환
        String[] arr = new String[numbers.length];
        int a_len = arr.length;

        for (int i = 0; i < a_len; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 문자열 배열을 s2 + s1 과 s1 + s2 로 비교하여 정렬
        Arrays.sort(arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        // 가장 큰 수 가 0일 경우 0으로 반환
        if (arr[0].equals("0")) {
            return "0";
        }
        // 그렇지 않다면 숫자를 붙여서 문자열로 만들어서 반환
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < a_len; i++) {
            answer.append(arr[i]);
        }

        return answer.toString();
    }

}