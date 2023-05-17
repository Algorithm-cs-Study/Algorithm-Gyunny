package study2.스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _003기능개발 {

    public static void main(String[] args) throws IOException {
        _003기능개발 t = new _003기능개발();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer p_st = new StringTokenizer(br.readLine());
        int[] progresses = new int[p_st.countTokens()];
        int p_len = progresses.length;
        for (int i = 0; i < p_len; i++) {
            progresses[i] = Integer.parseInt(p_st.nextToken());
        }
        StringTokenizer s_st = new StringTokenizer(br.readLine());
        int[] speeds = new int[s_st.countTokens()];
        int s_len = speeds.length;
        for (int i = 0; i < s_len; i++) {
            speeds[i] = Integer.parseInt(s_st.nextToken());
        }
        System.out.println(Arrays.toString(t.solution(progresses, speeds)));
    }

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();
        int s_len = speeds.length;

        for (int i = 0; i < s_len; i++) {
            int date = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
            if (!q.isEmpty() && q.peek() < date) {
                arr.add(q.size());
                q.clear();
            }
            q.offer(date);
        }
        arr.add(q.size());

        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }

}