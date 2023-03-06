package study.lv1;

public class _34크기가작은문자열 {

    public static void main(String[] args) {
        _34크기가작은문자열 t = new _34크기가작은문자열();
        String s = "10203";
        String p = "15";
        System.out.println(t.solution(s, p));
    }

    // 런타임 에러 .. ?
    public int solution(String s, String p) {
        int cnt = 0;
        for (int i = 0; i <= s.length() - p.length(); i++) {
            String str = s.substring(i, i + p.length());
            System.out.println("str = " + str);
            if (Integer.parseInt(str) <= Integer.parseInt(p)) {
                cnt++;
            }
        }

        return cnt;
    }

}