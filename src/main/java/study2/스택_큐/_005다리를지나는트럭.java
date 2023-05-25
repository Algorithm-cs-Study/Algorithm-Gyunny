package study2.스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
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
        Queue<Integer> bridge = new LinkedList<>();
        int current_weight = 0;
        int time = 0;

        int len = truck_weights.length;
        for (int i = 0; i < len; i++) {
            int current_truck = truck_weights[i];

            while (true) {
                if (bridge.isEmpty()) {
                    bridge.add(current_truck);
                    current_weight += current_truck;
                    time++;
                    break;
                } else if (bridge.size() == bridge_length) {
                    current_weight -= bridge.poll();
                } else {
                    if (current_weight + current_truck <= weight) {
                        bridge.add(current_truck);
                        current_weight += current_truck;
                        time++;
                        break;
                    } else {
                        bridge.add(0);
                        time++;
                    }
                }
            }
        }

        return time + bridge_length;
    }

}