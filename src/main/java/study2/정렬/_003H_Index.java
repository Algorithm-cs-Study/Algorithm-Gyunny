package study2.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _003H_Index {

    public static void main(String[] args) throws IOException {
        _003H_Index t = new _003H_Index();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] citations = new int[st.countTokens()];
        int len = citations.length;
        for (int i = 0; i < len; i++) {
            citations[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(t.solution(citations));
    }

    public int solution(int[] citations) {
        int answer = 0;
        // 배열을 오름차순으로 정렬
        Arrays.sort(citations);

        // 배열의 길이를 미리 변수로 할당
        int len = citations.length;
        for (int i = 0; i < len; i++) {
            // 현재 citations 과 남은 citations 중 최소값 할당
            int min = Math.min(citations[i], citations.length - i);
            // 최소값이 현재 결과보다 높다면
            if (min >= answer) {
                // 결과가 최소값으로 업데이트
                answer = min;
            } else {
                // 그렇지 않다면 반복문을 종료
                break;
            }
        }

        return answer;
    }

}