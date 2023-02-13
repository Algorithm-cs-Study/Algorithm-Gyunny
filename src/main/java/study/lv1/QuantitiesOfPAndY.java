package study.lv1;

import java.util.Scanner;

public class QuantitiesOfPAndY {

    public static void main(String[] args) {
        QuantitiesOfPAndY t = new QuantitiesOfPAndY();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public boolean solution(String s) {
        int p = 0;
        int y = 0;
        char[] chars = s.toUpperCase().toCharArray();
        for (char x : chars) {
            if (x == 'P') {
                p++;
            }
            if (x == 'Y') {
                y++;
            }
        }
        return p == y;
    }

}