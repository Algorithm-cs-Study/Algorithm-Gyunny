package study.lv2;

import java.util.ArrayList;
import java.util.Collections;

public class _01최댓값과최솟값 {

    public static void main(String[] args) {
        _01최댓값과최솟값 t = new _01최댓값과최솟값();
        String s = "1 2 3 4";
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();
        String[] str = s.split(" ");
        for (String x : str) {
            arr.add(Integer.parseInt(x));
        }

        answer = "" + Collections.min(arr) + " " + Collections.max(arr);
        return answer;
    }

}