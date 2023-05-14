package study2.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _001폰켓몬 {

    public static void main(String[] args) throws IOException {
        _001폰켓몬 t = new _001폰켓몬();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[st.countTokens()];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(t.solution(nums));


    }

    public int solution(int[] nums) {
        //해시맵을 사용하여 폰켓몬 종류 번호와 개수를 저장했습니다.
        HashMap<Integer, Integer> map = new HashMap<>();
        // 배열 nums의 요소들을 순회하면서 해시맵에 종류 번호와 개수 저장
        Arrays.stream(nums).forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));
        // 폰켓몬 종류의 수와 선택할 수 있는 최대 종류의 수를 비교하여 작은 값 반환
        return Math.min(map.size(), nums.length / 2);
    }

}