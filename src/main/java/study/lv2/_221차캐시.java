package study.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _221차캐시 {

    public static void main(String[] args) throws IOException {
        _221차캐시 t = new _221차캐시();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cacheSize = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] cities = new String[st.countTokens()];
        int len = cities.length;
        for (int i = 0; i < len; i++) {
            cities[i] = st.nextToken();
        }
        System.out.print(t.solution(cacheSize, cities));
    }

    public int solution(int cacheSize, String[] cities) {
        Deque<String> cache = new LinkedList<>();
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        int answer = 0;
        for (String city : cities) {
            city = city.toUpperCase();
            if (cache.remove(city)) {
                cache.add(city);
                answer++;
            } else {
                if (cache.size() >= cacheSize) {
                    cache.removeFirst();
                }
                cache.add(city);
                answer += 5;
            }
        }

        return answer;
    }


}