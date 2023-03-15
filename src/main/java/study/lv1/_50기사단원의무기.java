package study.lv1;

public class _50기사단원의무기 {

    public static void main(String[] args) {
        _50기사단원의무기 t = new _50기사단원의무기();
        int number = 10;
        int limit = 3;
        int power = 2;
        System.out.println(t.solution(number, limit, power));
    }

    public int solution(int number, int limit, int power) {
        int[] arr = new int[number + 1];
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                arr[i * j]++;
            }
        }

        for (int i = 1; i <= number; i++) {
            if (arr[i] > limit) {
                answer += power;
            } else {
                answer += arr[i];
            }
        }

        return answer;
    }

}