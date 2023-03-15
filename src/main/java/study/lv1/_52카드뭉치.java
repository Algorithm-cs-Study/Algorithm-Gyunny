package study.lv1;

import java.util.*;

public class _52카드뭉치 {

    public static void main(String[] args) {
        _52카드뭉치 t = new _52카드뭉치();
        String[] card1 = {"i", "drink", "water"};
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(t.solution(card1, card2, goal));
    }

    int idx = 0;
    int idx2 = 0;

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean isMatched = Arrays.stream(goal)
                                    .allMatch(word -> {
                                        if (idx < cards1.length && cards1[idx].equals(word)) {
                                            idx++;
                                            return true;
                                        }
                                        if (idx2 < cards2.length && cards2[idx2].equals(word)) {
                                            idx2++;
                                            return true;
                                        }
                                        return false;
                                    });

        return isMatched ? "Yes" : "No";
    }

}