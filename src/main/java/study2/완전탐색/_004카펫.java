package study2.완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _004카펫 {

    public static void main(String[] args) throws IOException {
        _004카펫 t = new _004카펫();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(t.solution(b, y)));
    }

    public int[] solution(int b, int y) {
        int[] answer = new int[2];

        for (int i = 3; i < b + y; i++) {
            int width = (b + y) / i;
            if (width >= i) {
                if ((i - 2) * (width - 2) == y) {
                    answer[0] = width;
                    answer[1] = i;
                    break;
                }
            }
        }

        return answer;
    }

}