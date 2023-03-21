package study.lv1;

import java.util.Stack;

public class _59햄버거만들기 {

    public static void main(String[] args) {
        _59햄버거만들기 t = new _59햄버거만들기();
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(t.solution(ingredient));
    }

    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> burger = new Stack<Integer>();

        for (int x : ingredient) {
            burger.push(x);

            if (burger.size() >= 4) {
                if (burger.get(burger.size() - 4) == 1 &&
                        burger.get(burger.size() - 3) == 2 &&
                        burger.get(burger.size() - 2) == 3 &&
                        burger.get(burger.size() - 1) == 1) {

                    answer++;
                    burger.pop();
                    burger.pop();
                    burger.pop();
                    burger.pop();
                }
            }
        }

        return answer;
    }

}