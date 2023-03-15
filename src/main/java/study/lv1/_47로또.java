package study.lv1;

public class _47로또 {

    public static void main(String[] args) {
        _47로또 t = new _47로또();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        for (int x : t.solution(lottos, win_nums)) {
            System.out.print(x + " ");
        }
    }

    // 테스트 14...
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int rank = 0;

        for (int i = 0; i < lottos.length; i++) {

            if (lottos[i] == 0) {
                cnt++;
            }

            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    rank++;
                }
            }
        }

        if (cnt == 0 && rank == 0) {
            answer[0] = 1;
            answer[1] = 6;
        } else {
            answer[0] = 7 - rank - cnt;
            answer[1] = 7 - rank;
        }

        return answer;
    }

}