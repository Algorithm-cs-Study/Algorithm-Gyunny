package study.lv1;

import java.time.LocalDate;

public class _36_2016년 {

    public static void main(String[] args) {
        _36_2016년 t = new _36_2016년();
        int a = 5;
        int b = 24;
        System.out.println(t.solution(a, b));
    }

    public String solution(int a, int b) {
        String[] week = {"", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        return week[LocalDate.of(2016, a, b).getDayOfWeek().getValue()];
    }

}