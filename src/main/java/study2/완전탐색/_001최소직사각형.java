package study2.완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _001최소직사각형 {

    public static void main(String[] args) throws IOException {
        _001최소직사각형 t = new _001최소직사각형();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sizes_count = Integer.parseInt(br.readLine());
        int[][] sizes = new int[sizes_count][2];
        for (int i = 0; i < sizes_count; i++) {
            StringTokenizer s_st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                sizes[i][j] = Integer.parseInt(s_st.nextToken());
            }
        }
        System.out.println(t.solution(sizes));
    }

    public int solution(int[][] sizes) {
        // max_w, max_h 변수를 생성하고 최소 값으로 초기화 -> 각각 넓이와 높이 저장하는 데 사용
        int max_w = Integer.MIN_VALUE;
        int max_h = Integer.MIN_VALUE;

        for (int[] size : sizes) {
            // 가로 세로 중 더 작은 값을 min에 저장하고 더 큰 값을 max에 저장
            int min = Math.min(size[0], size[1]);
            int max = Math.max(size[0], size[1]);
            // max 값을 이전 max_w와 비교하여 더 큰 값을 max_w에 저장 [max_h 도 마찬가지]
            max_w = Math.max(max, max_w);
            max_h = Math.max(min, max_h);
        }

        // 가장 큰 넓이와 높이를 곱하여 반환
        return max_w * max_h;
    }


}