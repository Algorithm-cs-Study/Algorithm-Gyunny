package study.lv1;

import java.util.*;

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

    // 재도전..
    public ArrayList<Integer> solution(String[] id_list, String[] report, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<String, ArrayList<String>> map = new TreeMap<>();

        for (String x : id_list) {
            ArrayList<String> arr = new ArrayList<>();

            for (String y : report) {
                String[] reportList = y.split(" ");
                String from = reportList[0];
                String to = reportList[1];

                if (x.equals(from)) {
                    arr.add(to);
                }
                map.put(x, arr);
            }
        }

        return answer;
    }

}