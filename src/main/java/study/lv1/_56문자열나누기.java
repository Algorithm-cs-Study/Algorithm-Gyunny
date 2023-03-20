package study.lv1;

public class _56문자열나누기 {

    public static void main(String[] args) {
        _56문자열나누기 t = new _56문자열나누기();
        String s = "abracadabra";
        System.out.println(t.solution(s));
    }

    public int solution(String s) {
        int answer = 1;
        int cnt = 1;
        int cnt2 = 0;
        char[] chars = s.toCharArray();
        char c = chars[0];
        for (int i = 1; i < s.length() - 1; i++) {
            if (chars[i] == c) {
                cnt++;
            } else {
                cnt2++;
                if (cnt == cnt2) {
                    c = chars[i + 1];
                    answer++;
                }
            }

        }

        return answer;
    }

}