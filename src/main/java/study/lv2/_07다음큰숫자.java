package study.lv2;

public class _07다음큰숫자 {

    public static void main(String[] args) {
        _07다음큰숫자 t = new _07다음큰숫자();
        int n = 78;
        System.out.println(t.solution(n));
    }

    // 구글링
    public int solution(int n) {
        int a = Integer.bitCount(n);
        int compare = n + 1;
        while (true) {
            if (Integer.bitCount(compare) == a)
                break;
                compare++;
        }

        return compare;
    }

}