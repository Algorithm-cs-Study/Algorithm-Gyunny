package study.lv2;

import java.util.Scanner;

public class _11카펫 {

    public static void main(String[] args) {
        _11카펫 t = new _11카펫();
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int y = sc.nextInt();
        for (int x : t.solution(b, y)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int b, int y) {
        int[] answer = new int[2];

        for (int i = 3; i < b + y; i++) {
            int width = (b + y) / i;
            if (width >= i) {
                if ((i - 2) * (width - 2) == y) {
                    answer[0] = width;
                    answer[1] = i;
                    break;
                }
            }
        }

        return answer;
    }

}