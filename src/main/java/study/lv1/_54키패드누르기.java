package study.lv1;

public class _54키패드누르기 {

    public static void main(String[] args) {
        _54키패드누르기 t = new _54키패드누르기();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(t.solution(numbers, hand));
    }

    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12;

        for (int x : numbers) {
            if (x == 1 || x == 4 || x == 7) {
                sb.append("L");
                left = x;

            } else if (x == 3 || x == 6 || x == 9) {
                sb.append("R");
                right = x;

            } else {
                if (x == 0) {
                    x += 11;
                }
                int l = (Math.abs(x - left)) / 3 + (Math.abs(x - left)) % 3;
                int r = (Math.abs(x - right)) / 3 + (Math.abs(x - right)) % 3;
                if (l == r) {
                    if (hand.equals("right")) {
                        sb.append("R");
                        right = x;
                    } else {
                        sb.append("L");
                        left = x;
                    }
                } else if (l > r) {
                    sb.append("R");
                    right = x;
                } else {
                    sb.append("L");
                    left = x;
                }
            }
        }
        return sb.toString();
    }

}