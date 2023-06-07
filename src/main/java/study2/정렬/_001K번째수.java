package study2.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _001K번째수 {

    public static void main(String[] args) throws IOException {
        _001K번째수 t = new _001K번째수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer a_st = new StringTokenizer(br.readLine());

        int[] array = new int[a_st.countTokens()];
        int len = array.length;
        for (int i = 0; i < len; i++) {
            array[i] = Integer.parseInt(a_st.nextToken());
        }

        int command_count = Integer.parseInt(br.readLine());
        int[][] commands = new int[command_count][3];
        for (int i = 0; i < command_count; i++) {
            StringTokenizer c_st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                commands[i][j] = Integer.parseInt(c_st.nextToken());
            }
        }

        System.out.print(Arrays.toString(t.solution(array, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;

        int[] answer = new int[len];

        for (int c = 0; c < len; c++) {
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];

            int[] tmp = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(tmp);
            answer[c] = tmp[k - 1];
        }

        return answer;
    }

}