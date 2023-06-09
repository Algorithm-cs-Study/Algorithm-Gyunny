package study2.완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _002모의고사 {

    public static void main(String[] args) throws IOException {
        _002모의고사 t = new _002모의고사();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer a_st = new StringTokenizer(br.readLine());

        int[] answers = new int[a_st.countTokens()];
        int len = answers.length;
        for (int i = 0; i < len; i++) {
            answers[i] = Integer.parseInt(a_st.nextToken());
        }
        System.out.println(Arrays.toString(t.solution(answers)));
    }

    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2};
        int[] c = {3, 3, 1, 1, 2};
        int[] score = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) {
                score[0]++;
            }
            if (answers[i] == b[i % b.length]) {
                score[1]++;
            }
            if (answers[i] == c[i % c.length]) {
                score[2]++;
            }
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if (maxScore == score[0]) {
            list.add(1);
        }
        if (maxScore == score[1]) {
            list.add(2);
        }
        if (maxScore == score[2]) {
            list.add(3);
        }

        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }

}