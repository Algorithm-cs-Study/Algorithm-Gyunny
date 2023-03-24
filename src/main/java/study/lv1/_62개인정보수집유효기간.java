package study.lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _62개인정보수집유효기간 {

    public static void main(String[] args) {
        _62개인정보수집유효기간 t = new _62개인정보수집유효기간();
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        for (Integer x : t.solution(today, terms, privacies)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        int todayCounts = getDays(today);

        Map<String, String> termMap = new HashMap<>();
        for (String x : terms) {
            String[] term = x.split(" ");
            String alpha = term[0];
            String month = term[1];

            termMap.put(alpha, month);
        }

        int cnt = 1;
        for (String x : privacies) {
            String[] privacy = x.split(" ");
            String date = privacy[0];
            String alpha = privacy[1];

            int monthLimit = Integer.parseInt(termMap.get(alpha));
            int limitDayDayCount = getDays(date) + getDays(monthLimit);
            if (todayCounts >= limitDayDayCount) {
                answer.add(cnt);
            }
            cnt++;
        }

        return answer;
    }

    private int getDays(String strOfDate) {
        String[] todayWords = strOfDate.split("\\.");
        int y = Integer.parseInt(todayWords[0]);
        int m = Integer.parseInt(todayWords[1]);
        int d = Integer.parseInt(todayWords[2]);
        return (y * (28 * 12)) + (m * 28) + d;
    }

    private int getDays(int month) {
        return (month * 28);
    }

}