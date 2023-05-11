package study.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _23n제곱배열자르기 {

    public static void main(String[] args) throws IOException {
        _23n제곱배열자르기 t = new _23n제곱배열자르기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int left = Integer.parseInt(br.readLine());
        int right = Integer.parseInt(br.readLine());
        int[] result = t.solution(n, left, right);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        int len = answer.length;

        for(int i = 0; i < len; i++){
            int row = (int)((i + left) / n) + 1;
            int col = (int)((i + left) % n) + 1;
            answer[i] = Math.max(row, col);
        }

        return answer;
    }

}