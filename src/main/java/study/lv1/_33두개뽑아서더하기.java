package study.lv1;

import java.util.HashSet;
import java.util.Set;

public class _33두개뽑아서더하기 {

    public static void main(String[] args) {
        _33두개뽑아서더하기 t = new _33두개뽑아서더하기();
        int[] numbers = {2, 1, 3, 4, 1};
        for (Integer x : t.solution(numbers)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}