package study.lv1;

public class _45다트게임 {

    public static void main(String[] args) {
        _45다트게임 t = new _45다트게임();
        String dartResult = "1S2D*3T";
        System.out.println(t.solution(dartResult));
    }

    public int solution(String dartResult) {
        int[] dart = new int[3];
        int n = 0;
        int idx = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (c >= '0' && c <= '9') {
                sb.append(c);
            } else if (c == 'S' || c == 'D' || c == 'T') {
                n = Integer.parseInt(sb.toString());
                if (c == 'S') {
                    dart[idx++] = (int) Math.pow(n, 1);
                } else if (c == 'D') {
                    dart[idx++] = (int) Math.pow(n, 2);
                } else {
                    dart[idx++] = (int) Math.pow(n, 3);
                }
                sb = new StringBuilder();
            } else {
                if (c == '*') {
                    dart[idx - 1] *= 2;
                    if (idx - 2 >= 0) {
                        dart[idx - 2] *= 2;
                    }
                } else {
                    dart[idx - 1] *= (-1);
                }
            }
        }

        return dart[0] + dart[1] + dart[2];
    }

}