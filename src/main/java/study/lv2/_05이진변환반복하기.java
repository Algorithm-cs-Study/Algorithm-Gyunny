package study.lv2;

public class _05이진변환반복하기 {

    public static void main(String[] args) {
        _05이진변환반복하기 t = new _05이진변환반복하기();
        String s = "110010101001";
        for (int x : t.solution(s)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(String s) {
        int[] answer = new int[2];

        while (s.length() > 1) {
            for (Character x : s.toCharArray()) {
                if (x == '0') {
                    answer[1]++;
                }
            }

            s = Integer.toBinaryString(s.replace("0", "").length());
            answer[0]++;
        }

        return answer;
    }

}