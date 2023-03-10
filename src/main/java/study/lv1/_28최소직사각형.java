package study.lv1;

import java.util.Scanner;

public class _28최소직사각형 {

    public static void main(String[] args) {
        _28최소직사각형 t = new _28최소직사각형();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] sizes = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sizes[i].length; j++) {
                sizes[i][j] = sc.nextInt();
            }
        }
        System.out.println(t.solution(sizes));
    }
    public int solution(int[][] sizes) {
        int len = 0;
        int hgt = 0;

        for (int[] size : sizes) {
            len = Math.max(len, Math.max(size[0], size[1]));
            hgt = Math.max(hgt, Math.min(size[0], size[1]));
        }

        return len * hgt;
    }


}