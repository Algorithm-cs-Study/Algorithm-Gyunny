package study2.완전탐색;

import java.util.LinkedList;
import java.util.Queue;

public class _006전력망을둘로나누기 {

    public static void main(String[] args) {
        _006전력망을둘로나누기 t = new _006전력망을둘로나누기();
        int n = 9;
        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
        System.out.print(t.solution(n, wires));
    }

    // 연결 정보를 저장하는 변수
    public int[][] connection;

    public int solution(int n, int[][] wires) {
        // answer 에 초기 송전탑 개수를 선언
        int answer = n;
        connection = new int[n + 1][n + 1];

        // 반복문을 통해 각 송전탑에 연결 정보를 connection 에 저장
        for (int[] wire : wires) {
            int from = wire[0];
            int to = wire[1];
            connection[from][to] = 1;
            connection[to][from] = 1;
        }

        // 각 송전탑의 연결 정보를 차례대로 제거
        for (int[] wire : wires) {
            int from = wire[0];
            int to = wire[1];
            connection[from][to] = 0;
            connection[to][from] = 0;

            // 송전탑의 연결 정보 제거한 후, bfs 함수를 사용하여 두 전력망의 송전탑의 개수 차이를 계산하여,
            // answer와 비교해서 더 작은 값을 answer에 저장
            // 그 후, 송전탑을 다시 연결
            answer = Math.min(answer, bfs(n, from));
            connection[from][to] = 1;
            connection[to][from] = 1;
        }

        return answer;
    }

    private int bfs(int n, int x) {
        boolean[] visits = new boolean[n + 1];
        int count = 1;

        // 노드를 큐에 저장
        Queue<Integer> queue = new LinkedList<>();
        // 해당 노드에 접근 시 방문 표시
        visits[x] = true;
        queue.offer(x);

        // queue에 있는 노드를 반복, 노드에 연결된 노드를 queue에 추가
        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 1; i <= n; i++) {
                // 연결된 노드를 방문하면 true를 주고, count를 증가
                if (connection[temp][i] == 1 && !visits[i]) {
                    visits[i] = true;
                    queue.offer(i);
                    count++;
                }
            }
        }

        // 두 전력망의 송전탑 개수의 차이를 반환
        // 첫 번째 전력망의 송전탑 개수 - 두 번째 전력망의 송전탑 개수
        return Math.abs(count - (n - count));
    }

}