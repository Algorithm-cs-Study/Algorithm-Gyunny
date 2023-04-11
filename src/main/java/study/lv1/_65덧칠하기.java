package study.lv1;

public class _65덧칠하기 {

    public static void main(String[] args) {
        _65덧칠하기 t = new _65덧칠하기();
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        System.out.println(t.solution(n, m, section));
    }

    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int max = 0;
        int endPoint = section[section.length - 1];

        for (int i = 0; i < section.length; i++) {
            if (section[i] < max) {
                continue;
            }
            if (endPoint < max) {
                break;
            }

            answer += 1;
            max = section[i] + m;
        }

        return answer;
    }

}