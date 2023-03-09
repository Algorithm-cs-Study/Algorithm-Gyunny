package study.lv1;

public class _39가장가까운같은글자 {

    public static void main(String[] args) {
        _39가장가까운같은글자 t = new _39가장가까운같은글자();
        String s = "banana";
        for (int x : t.solution(s)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    answer[i] = i - j;
                }
            }
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }

        return answer;
    }

}