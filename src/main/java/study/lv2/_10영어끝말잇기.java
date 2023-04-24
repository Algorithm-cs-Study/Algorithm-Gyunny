package study.lv2;

import java.util.Scanner;
import java.util.Stack;

public class _10영어끝말잇기 {

    public static void main(String[] args) {
        _10영어끝말잇기 t = new _10영어끝말잇기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        for (int x : t.solution(n, words)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Stack<String> stack = new Stack<>();
        stack.push(words[0]);
        int cnt = 1;
        for (int i = 1; i < words.length; i++) {
            if (stack.contains(words[i])) {
                break;
            }
            if (stack.peek().charAt(stack.peek().length() - 1) == words[i].charAt(0)) {
                stack.push(words[i]);
                cnt++;
            } else {
                break;
            }
        }

        if (cnt == words.length) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = cnt % n + 1;
            answer[1] = cnt / n + 1;
        }

        return answer;
    }

}