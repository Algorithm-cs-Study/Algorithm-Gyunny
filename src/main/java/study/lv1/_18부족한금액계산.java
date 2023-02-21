package study.lv1;

import java.util.Scanner;

public class _18부족한금액계산 {

    public static void main(String[] args) {
        _18부족한금액계산 t = new _18부족한금액계산();
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int money = sc.nextInt();
        int count = sc.nextInt();
        System.out.println(t.solution(price, money, count));
    }

    public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; ++i) {
            sum += price * i;
        }

        return sum - money < 0 ? 0 : sum - money;
    }

}