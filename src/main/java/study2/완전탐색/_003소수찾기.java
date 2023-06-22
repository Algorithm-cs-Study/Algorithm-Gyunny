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

        permutation(numbers, "", set);

        int count = 0;
        for (Integer num : set) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
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