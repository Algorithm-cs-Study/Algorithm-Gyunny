package study2.완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _003소수찾기 {

    public static void main(String[] args) throws IOException {
        _003소수찾기 t = new _003소수찾기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();
        System.out.println(t.solution(numbers));
    }

    public int solution(String numbers) {
        Set<Integer> set = new HashSet<>();

        // permutation 함수를 사용하여 가능한 모든 숫자 조합을 생성
        permutation(numbers, "", set);

        int count = 0;
        // 조합한 모든 숫자를 반복
        for (Integer num : set) {
            // 값들이 소수인지 isPrime 함수로 판단
            // 소수면 카운트 증가
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }


    // isPrime 메서드, 입력된 숫자가 소수인지 확인
    private boolean isPrime(int num) {
        // 1보다 큰 자연수 중 1과 자신을 제외한 자연수는 나누어 떨어지지 않으므로 소수가 아님
        if (num <= 1) {
            return false;
        }
        // 2는 소수의 정의에 정합한 짝수
        if (num == 2) {
            return true;
        }
        // 2을 제외한 나머지 짝수는 소수가 아님
        if (num % 2 == 0) {
            return false;
        }

        // 위에 2는 소수에 정의된 짝수이므로 3부터 반복문 시작, num의 제곱근 이하까지 반복
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void permutation(String numbers, String str, Set<Integer> set) {
        int len = numbers.length();
        if (!"".equals(str)) {
            set.add(Integer.valueOf(str));
        }
        for (int i = 0; i < len; i++) {
            permutation(
                    numbers.substring(0, i) + numbers.substring(i + 1, len),
                    str + numbers.charAt(i), set
            );
        }
    }

}