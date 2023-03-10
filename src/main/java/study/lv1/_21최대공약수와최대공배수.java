package study.lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class _21최대공약수와최대공배수 {

    public static void main(String[] args) {
        _21최대공약수와최대공배수 t = new _21최대공약수와최대공배수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (Integer x : t.solution(n, m)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int m) {
        ArrayList<Integer> answer = new ArrayList<>();
        int max = Math.max(n, m);
        int min = Math.min(n, m);

        for (int i = min; i >= 1; i--) {
            if (min % i == 0 && max % i == 0) {
                answer.add(i);
                break;
            }
        }

        int cnt = max;
        while (!(cnt % min == 0 && cnt % max == 0)) {
            cnt++;
        }
        answer.add(cnt);

        return answer;
    }

//    private int getGcd(int a, int b) {
//        int c = a % b;
//        if (c == 0) {
//            return b;
//        }
//
//        return getGcd(b, c);
//    }

}