package study.lv1;

import java.util.ArrayList;

public class _41모의고사 {

    public static void main(String[] args) {
        _41모의고사 t = new _41모의고사();
        int[] answer = {1, 3, 2, 4, 2};
        for (Integer x : t.solution(answer)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2};
        int[] student3 = {3, 3, 1, 1, 2};
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) {
                cnt1++;
            }
            if (answers[i] == student2[i % student2.length]) {
                cnt2++;
            }
            if (answers[i] == student3[i % student3.length]) {
                cnt3++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));
        if (max == cnt1) {
            list.add(1);
        }
        if (max == cnt2) {
            list.add(2);
        }
        if (max == cnt3) {
            list.add(3);
        }

        return list;
    }

}