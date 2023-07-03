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
        // 가로, 세로 크기를 담을 배열을 선언
        int[] answer = new int[2];

        // 카펫의 세로 길이는 최소 3부터 시작하고 갈색과 노란색 카펫을 합친 것보다 작을 때까지 반복
        for (int i = 3; i < (b + y) / 2; i++) {
            // 가로 길이는 전체 카펫의 수를 세로 길이로 나눈 몫
            int width = (b + y) / i;
            // 카펫의 가장자리는 갈색 카펫로 둘러쌓여 있고, 가로 세로 길이에서 2를 빼고 이를 곱하면 노란색 카펫의 수가 나옴
            // 만약 계산 결과가 노란색 카펫의 수와 같다면, 가로, 세로 길이가 정답이 됨
            if ((i - 2) * (width - 2) == y) {
                answer[0] = width;
                answer[1] = i;
                break;
            }
        }

        return answer;
    }

}