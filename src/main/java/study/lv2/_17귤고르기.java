package study.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _17귤고르기 {

    public static void main(String[] args) throws IOException {
        _17귤고르기 t = new _17귤고르기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int[] tangerine = new int[st.countTokens()];
        int len = tangerine.length;
        for (int i = 0; i < len; i++) {
            tangerine[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print(t.solution(k, tangerine));
    }

    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int answer = 0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            if (k <= 0) {
                break;
            }
            answer++;
            k -= entry.getValue();
        }

        return answer;
    }

}