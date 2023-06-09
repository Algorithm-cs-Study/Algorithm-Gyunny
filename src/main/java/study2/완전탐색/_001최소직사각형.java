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
        int max_w = Integer.MIN_VALUE;
        int max_h = Integer.MIN_VALUE;
        
        for (int[] size : sizes) {
            int min = Math.min(size[0], size[1]);
            int max = Math.max(size[0], size[1]);
            max_w = Math.max(max, max_w);
            max_h = Math.max(min, max_h);
        }

        return max_w * max_h;
    }


}