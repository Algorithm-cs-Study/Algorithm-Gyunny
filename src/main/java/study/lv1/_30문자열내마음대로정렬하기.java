package study.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _30문자열내마음대로정렬하기 {

    public static void main(String[] args) {
        _30문자열내마음대로정렬하기 t = new _30문자열내마음대로정렬하기();
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = sc.nextInt();
        for (String x : t.solution(s, n)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<String> solution(String[] strings, int n) {
        ArrayList<String> answer = Arrays.stream(strings)
                .map(s -> s.charAt(n) + s)
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> result = answer.stream()
                .map(s -> s.substring(1))
                .collect(Collectors.toCollection(ArrayList::new));

        return result;
    }

}