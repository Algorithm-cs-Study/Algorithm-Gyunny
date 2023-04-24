package study.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14점프와순간이동 {

    public static void main(String[] args) throws IOException {
        _14점프와순간이동 t = new _14점프와순간이동();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(t.solution(n));
    }

    public int solution(int n) {
        int answer = 0;

        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n--;
                answer++;
            }
        }

        return answer;
    }

}