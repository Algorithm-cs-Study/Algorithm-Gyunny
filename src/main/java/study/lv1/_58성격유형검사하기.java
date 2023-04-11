package study.lv1;

import java.util.HashMap;
import java.util.Map;

public class _58성격유형검사하기 {

    public static void main(String[] args) {
        _58성격유형검사하기 t = new _58성격유형검사하기();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(t.solution(survey, choices));
    }

    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            int score = choices[i];
            char first = survey[i].charAt(1);
            char second = survey[i].charAt(0);

            if (score > 4) {
                map.put(first, map.getOrDefault(first, 0) + score - 4);
            } else if (score < 4) {
                map.put(second, map.getOrDefault(second, 0) + 4 - score);
            } else {
                map.put(second, map.getOrDefault(second, 0));
            }
        }

        return new StringBuilder()
                .append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T')
                .append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F')
                .append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M')
                .append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N')
                .toString();
    }


}