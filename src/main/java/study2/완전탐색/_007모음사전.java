package study2.완전탐색;

import java.util.ArrayList;
import java.util.List;

public class _007모음사전 {

    public static void main(String[] args) {
        _007모음사전 t = new _007모음사전();
        String word = "AAAAE";
        System.out.print(t.solution(word));
    }

    public char[] WORDS = {'A', 'E', 'I', 'O', 'U'};
    public int MAX_LENGTH = 5;

    public int solution(String word) {
        int answer = 0;
        // 생성 가능한 모든 단어를 저장할 배열 리스트 선언
        List<String> alphabet = new ArrayList<>();

        // 시작하는 단어를 생성하기 위한 dfs 함수 호출
        for (char c : WORDS) {
            dfs(alphabet, String.valueOf(c));
        }

        int len = alphabet.size();
        // 생성된 단어 반복하며 입력으로 받은 word의 위치를 확인, 위치는 word의 순서와 동일
        for (int i = 0; i < len; i++) {
            if (alphabet.get(i).equals(word)) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }

    private void dfs(List<String> alphabet, String str) {
        // dfs 함수에서 단어의 길이가 최대 길이를 초과하는지 여부 확인
        if (str.length() > MAX_LENGTH) {
            return;
        }

        // 그렇지 않다면 str을 alphabet에 추가
        if (!alphabet.contains(str)) {
            alphabet.add(str);
        }

        // str에 추가한 새로운 단어를 생성하기 위해 dfs를 재귀 호출, 이를 통해 가능한 모든 단어의 조합을 생성
        for (char word : WORDS) {
            dfs(alphabet, str + word);
        }
    }

}