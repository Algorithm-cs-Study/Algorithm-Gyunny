package study2.그리디;

public class _002조이스틱 {

    public static void main(String[] args) {
        _002조이스틱 t = new _002조이스틱();
        String name = "JEROEN";
        System.out.println(t.solution(name));
    }

    public int solution(String name) {
        int answer = 0;
        int length = name.length();

        int index;
        int move = length - 1;

        // 각 문자마다 조이스틱 조작 횟수를 계산하여 answer에 더함
        for (int i = 0; i < length; i++) {
            // 현재 문자에서 'A'까지 조이스틱 조작 횟수와 'Z'부터 현재 문자까지 조이스틱 조작 횟수 중 작은 값을 선택하여 더함
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i + 1;
            // 다음 문자가 연속해서 'A'인 경우, 연속된 'A'의 마지막 인덱스를 찾음
            while (index < length && name.charAt(index) == 'A') {
                index++;
            }

            // 좌우 이동 거리를 계산하여 현재까지의 최소 이동 거리(move)와 비교하여 갱신
            move = Math.min(Math.min(move, i * 2 + length - index), (length - index) * 2 + i);
        }

        return answer + move;
    }

}