package study.lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class _32K번째수 {

    public static void main(String[] args) {
        _32K번째수 t = new _32K번째수();
        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        for (Integer x : t.solution(array, commands)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int[] info : commands) {
            int i = info[0];
            int j = info[1];
            int k = info[2];

            int[] tmp = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(tmp);
            answer.add(tmp[k - 1]);
        }

        return answer;
    }

}