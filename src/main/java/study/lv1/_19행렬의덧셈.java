package study.lv1;

import java.util.Scanner;

public class _19행렬의덧셈 {

    public static void main(String[] args) {
        _19행렬의덧셈 t = new _19행렬의덧셈();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
                arr2[i][j] = sc.nextInt();
            }
        }
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }

}