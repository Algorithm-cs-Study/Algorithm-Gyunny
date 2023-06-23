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
        /**
         * 중요도를 내림차순으로 정렬하는 우선순위 큐 생성
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            /**
             * 각 문서의 중요로들 우선순위 큐에 추가
             */
            pq.add(priorities[i]);
            /**
             * 각 문서의 위치를 큐에 추가
             */
            idx_q.add(i);
        }

        int answer = 0;

        while (!idx_q.isEmpty()) {
            /**
             * 현재 문서의 위치를 가져옴
             */
            int curIdx = idx_q.poll();
            /**
             * 현재 문서의 중요도를 가져옴
             */
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