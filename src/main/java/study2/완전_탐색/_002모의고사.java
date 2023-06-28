package study2.완전_탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _002모의고사 {

    public static void main(String[] args) throws IOException {
        _002모의고사 t = new _002모의고사();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer a_st = new StringTokenizer(br.readLine());

        int[] answers = new int[a_st.countTokens()];
        int len = answers.length;
        for (int i = 0; i < len; i++) {
            answers[i] = Integer.parseInt(a_st.nextToken());
        }
        System.out.println(Arrays.toString(t.solution(answers)));
    }

    public int[] solution(int[] answers) {
        // 프로그래머스 각 문제 패턴 예시
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 세 학생의 점수를 저장한 배열 선언
        int[] score = new int[3];
        // 입력된 답안의 배열의 원소를 반복
        for (int i = 0; i < answers.length; i++) {
            // 각 학생의 답안이 맞는지 확인, 정답이라면 점수를 증가
            // 문제 예상 답안 패턴 배열의 길이로 인덱스를 나눈 나머지를 사용하여 패턴이 반복
            if (answers[i] == a[i % a.length]) {
                score[0]++;
            }
            if (answers[i] == b[i % b.length]) {
                score[1]++;
            }
            if (answers[i] == c[i % c.length]) {
                score[2]++;
            }
        }

        // 세 학생의 점수 중 최대 값을 maxScore에 할당
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        // 최고 점수를 받은 학생의 번호를 저장할 배열리스트 생성
        ArrayList<Integer> list = new ArrayList<>();

        // 각 학생의 점수가 최고 점수와 같으면 해당 학생의 번호를 리스트에 추가
        if (maxScore == score[0]) {
            list.add(1);
        }
        if (maxScore == score[1]) {
            list.add(2);
        }
        if (maxScore == score[2]) {
            list.add(3);
        }

        // 리스트를 배열로 변환하여 반환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}