package study.lv1;

public class _42소수만들기 {

    public static void main(String[] args) {
        _42소수만들기 t = new _42소수만들기();
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(t.solution(nums));
    }

    public int solution(int[] nums) {
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

    public Boolean isPrime(int num) {
        int cnt = 0;
        for (int i = 1; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                cnt += 1;
            }
        }

        return cnt == 1;
    }

}