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

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zero = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt++;
                    win_nums[j] = -1;
                    break;
                }
            }
        }

        answer[0] = getRank(cnt + zero);
        answer[1] = getRank(cnt);

        return answer;
    }


    public int getRank(int count) {
        if (count == 6) {
            return 1;
        } else if (count == 5) {
            return 2;
        } else if (count == 4) {
            return 3;
        } else if (count == 3) {
            return 4;
        } else if (count == 2) {
            return 5;
        } else {
            return 6;
        }
    }

}