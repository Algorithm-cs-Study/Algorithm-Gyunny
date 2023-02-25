package study.lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class _22같은숫자는싫어 {

    public static void main(String[] args) {
        _22같은숫자는싫어 t = new _22같은숫자는싫어();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (Integer x : t.solution(arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i]) {
                answer.add(arr[i + 1]);
            }
        }

        return answer;
    }

}