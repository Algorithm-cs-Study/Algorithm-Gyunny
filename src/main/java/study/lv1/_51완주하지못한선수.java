package study.lv1;

import java.util.Arrays;
import java.util.HashMap;

public class _51완주하지못한선수 {

    public static void main(String[] args) {
        _51완주하지못한선수 t = new _51완주하지못한선수();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(t.solution(participant, completion));
    }


    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> result = new HashMap<>();

        Arrays.stream(participant)
                .forEach(p -> result.put(p, result.getOrDefault(p, 0) + 1));

        Arrays.stream(completion)
                .forEach(p -> result.put(p, result.get(p) - 1));

        for (String x : result.keySet()) {
            if (result.get(x) != 0){
                answer = x;
            }
        }

        return answer;
    }

}