package study.lv1;

import java.util.ArrayList;
import java.util.Collections;

public class _46명예의전당 {

    public static void main(String[] args) {
        _46명예의전당 t = new _46명예의전당();
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        for (int x : t.solution(k, score)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int k, int[] score) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> rank = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            if (i >= k) {
                rank.remove(Collections.min(rank));
            }

            answer.add(Collections.min(rank));
        }
        return answer;
    }

}