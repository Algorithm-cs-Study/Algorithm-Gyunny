package study.lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class _38폰켓몬 {

    public static void main(String[] args) {
        _38폰켓몬 t = new _38폰켓몬();
        int[] num = {3, 1, 2, 3};
        System.out.print(t.solution(num));
    }

    public int solution(int[] num) {
//        HashSet<Integer> answer = new HashSet<>();
//        for (int x : num) {
//            answer.add(x);
//        }

        HashSet<Integer> answer = Arrays.stream(num).boxed().collect(Collectors.toCollection(HashSet::new));

        return Math.min(answer.size(), num.length / 2);
    }

}