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
        // 우선순위 큐를 사용하여 스코빌 지수를 오름차순으로 관리
        PriorityQueue<Integer> queue = Arrays.stream(scoville)
                .boxed()
                .collect(Collectors.toCollection(PriorityQueue::new));
        // 모든 음식의 스코빌 지수가 k 이상이 될 때 까지 반복
        while (queue.peek() < k) {
            // 음식이 1개 밖에 없는데 k 이하면 -1을 반환
            if (queue.size() == 1) {
                return -1;
            }
            // 스코빌 지수가 가장 낮은 두 개의 음식을 합치고 결과를 큐에 다시 합침
            queue.add(queue.poll() + queue.poll() * 2);
            // 섞은 횟수를 증가 하여 반환
            answer++;
        }

        return answer;
    }

}