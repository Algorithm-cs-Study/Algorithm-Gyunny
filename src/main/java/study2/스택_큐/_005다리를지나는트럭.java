package study2.스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _005다리를지나는트럭 {

    public static void main(String[] args) throws IOException, IOException {
        _005다리를지나는트럭 t = new _005다리를지나는트럭();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bridge_length = Integer.parseInt(br.readLine());
        int weight = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] truck_weights = new int[st.countTokens()];
        int len = truck_weights.length;
        for (int i = 0; i < len; i++) {
            truck_weights[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(t.solution(bridge_length, weight, truck_weights));
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;


        return answer;
    }

}