package study2.완전_탐색;

import java.io.IOException;

public class _005피로도 {

    public static void main(String[] args) throws IOException {
        _005피로도 t = new _005피로도();
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        System.out.print(t.solution(k, dungeons));
    }

    // 탐험한 던전의 수를 저장하는 변수
    public int adventure = 0;

    public int solution(int k, int[][] dungeons) {
        int len = dungeons.length;
        int[] adventures = new int[len];
        int count = 0;

        // dfs 함수를 호출하여 최대 던전 탐험한 수를 계산
        dfs(dungeons, adventures, k, count);

        return adventure;
    }

    // 현재 피로도 상태에서 던전을 탐험하는 모든 가능의 수를 탐색
    private void dfs(int[][] dungeons, int[] adventures, int k, int count) {
        int len = dungeons.length;
        for (int i = 0; i < len; i++) {
            // 각 던전을 탐험하지 않고, 현재 피로도가 던전을 탐험할 때 필요한 피로도보다 높거나 같은 경우에, 탐험
            if (adventures[i] == 0 && k >= dungeons[i][0]) {
                adventures[i] = 1;
                dfs(dungeons, adventures, k - dungeons[i][1], count + 1);
                // 가능한 던전을 모두 탐험한 후 방문 상태를 원상태로 복귀
                adventures[i] = 0;
            }
        }

        if (adventure < count) {
            adventure = count;
        }
    }

}