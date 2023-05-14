package study2.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _002완주하지못한선수 {

    public static void main(String[] args) throws IOException {
        _002완주하지못한선수 t = new _002완주하지못한선수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] participant = new String[st.countTokens()];
        int len = participant.length;
        for (int i = 0; i < len; i++) {
            participant[i] = st.nextToken();
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        String[] completion = new String[st2.countTokens()];
        int len2 = completion.length;
        for (int i = 0; i < len2; i++) {
            completion[i] = st2.nextToken();
        }
        System.out.println(t.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        // 참가자와 완주자를 저장할 해시맵 생성했습니다.
        HashMap<String, Integer> map = new HashMap<>();
        // 참가자 배열을 순회하면서 해시맵에 참가자 이름과 개수를 저장합니다.
        Arrays.stream(participant).forEach(player -> map.put(player, map.getOrDefault(player, 0) + 1));
        // 완주자 배열을 순회하면서 해시맵에서 참가자 개수를 1씩 감소합니다.3
        Arrays.stream(completion).forEach(player -> map.put(player, map.get(player) - 1));
        // 해시맵을 순회하면서 개수가 0이 아닌 참가자를 찾아서 반환합니다.
        return map.keySet().stream().filter(key -> map.get(key) != 0).findFirst().orElse("");
    }

}