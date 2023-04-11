package study.lv2;

import java.util.Arrays;
import java.util.Scanner;

public class _12구명보트 {

    public static void main(String[] args) {
        _12구명보트 t = new _12구명보트();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }
        int limit = sc.nextInt();
        System.out.print(t.solution2(people, limit));
    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int idx = 0;

        for (int i = people.length - 1; i >= idx; i--) {
            if (people[i] + people[idx] <= limit) {
                idx++;
            }
            answer++;
        }

        return answer;
    }

    public int solution2(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        for (; i < j; --j) {
            if (people[i] + people[j] <= limit)
                ++i;
        }
        return people.length - i;
    }

}