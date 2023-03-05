package study.lv1;

import java.util.Scanner;

public class _29비밀지도 {

    public static void main(String[] args) {
        _29비밀지도 t = new _29비밀지도();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        for (String x : t.solution(n, arr1, arr2)) {
            System.out.println(x);
        }

    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String tmp;

        for(int i = 0 ; i < n ; i++){
            tmp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
            tmp = tmp.substring(tmp.length() - n);
            tmp = tmp.replaceAll("1", "#");
            tmp = tmp.replaceAll("0", " ");
            answer[i] = tmp;
        }

        return answer;
    }

}