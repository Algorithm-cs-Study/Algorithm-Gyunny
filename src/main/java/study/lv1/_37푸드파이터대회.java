package study.lv1;

public class _37푸드파이터대회 {

    public static void main(String[] args) {
        _37푸드파이터대회 t = new _37푸드파이터대회();
        int[] food = {1, 7, 1, 2};
        System.out.println(t.solution(food));
    }

    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        food[0] = 0;
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer.append(i);
            }
        }
        StringBuilder result = new StringBuilder(answer);
        return answer.append(food[0]).append(result.reverse()).toString();
    }

}