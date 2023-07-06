package study2.그리디;

import java.util.Arrays;

public class _004구명보트 {

    public static void main(String[] args) {
        _004구명보트 t = new _004구명보트();
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(t.solution(people, limit));
    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        // 사람들의 몸무게를 오름차순으로 정렬
        Arrays.sort(people);
        // 가장 가벼운 사람의 인덱스를 나타내는 변수
        int idx = 0;

        // 가장 무거운 사람부터 시작하여 가장 가벼운 사람과 같이 탈 수 있는지 확인
        for (int i = people.length - 1; i >= idx; i--) {
            // 가장 무거운 사람과 가장 가벼운 사람의 몸무게의 합이 제한 무게(limit)보다 작거나 같다면,
            // 두 사람은 같이 구명보트에 탈 수 있음
            if (people[i] + people[idx] <= limit) {
                // 가장 가벼운 사람의 인덱스를 증가
                idx++;
            }

            // 구명보트의 수를 증가
            answer++;
        }

        return answer;
    }

}