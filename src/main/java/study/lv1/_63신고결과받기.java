package study.lv1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _63신고결과받기 {

    public static void main(String[] args) {
        _63신고결과받기 t = new _63신고결과받기();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        for (Integer x : t.solution(id_list, report, k)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            countMap.put(name, i);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            map.get(to).add(from);
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> set = map.get(id_list[i]);
            if (set.size() >= k) {
                for (String x : set) {
                    answer[countMap.get(x)]++;
                }
            }
        }

        return answer;
    }

}