package study2.힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class _001더맵게 {

    public static void main(String[] args) throws IOException {
        _001더맵게 t = new _001더맵게();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scoville = new int[st.countTokens()];
        int len = scoville.length;
        for (int i = 0; i < len; i++) {
            scoville[i] = Integer.parseInt(st.nextToken());
        }
        int k = Integer.parseInt(br.readLine());
        System.out.println(t.solution(scoville, k));
    }

    public int solution(int[] scoville, int k) {
        int answer = 0;
        PriorityQueue<Integer> queue;

        queue = Arrays.stream(scoville)
                .boxed()
                .collect(Collectors.toCollection(PriorityQueue::new));

        while(queue.peek() < k) {
            if (queue.size() == 1) {
                return -1;
            }
            queue.add(queue.poll() + queue.poll() * 2);
            answer++;
        }

        return answer;
    }

}