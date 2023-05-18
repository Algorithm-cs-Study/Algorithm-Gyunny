package study2.스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _004프로세스 {

    public static void main(String[] args) throws IOException {
        _004프로세스 t = new _004프로세스();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] priorities = new int[st.countTokens()];
        int p_len = priorities.length;
        for (int i = 0; i < p_len; i++) {
            priorities[i] = Integer.parseInt(st.nextToken());
        }
        int location = Integer.parseInt(br.readLine());
        System.out.println(t.solution(priorities, location));
    }

    public int solution(int[] priorities, int location) {
        Queue<Integer> idx_q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
            idx_q.add(i);
        }

        int answer = 0;

        while (!idx_q.isEmpty()) {
            int curIdx = idx_q.poll();
            int curPriority = priorities[curIdx];

            if (curPriority == pq.peek()) {
                pq.poll();
                answer++;
                if (curIdx == location)
                    return answer;
            } else {
                idx_q.add(curIdx);
            }
        }

        return -1;
    }

}