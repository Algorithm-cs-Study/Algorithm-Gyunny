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
        // bridge를 Queue로 만들어줍니다.
        Queue<Integer> bridge = new LinkedList<>();
        // 현재 다리 위의 무게와 시간을 표현하는 변수를 만들어줍니다.
        int current_weight = 0;
        int time = 0;

        int len = truck_weights.length;
        for (int i = 0; i < len; i++) {
            int current_truck = truck_weights[i];

            while (true) {
                // 다리가 비어있으면 트럭을 다리에 올리는 조건문
                if (bridge.isEmpty()) {
                    bridge.add(current_truck);
                    current_weight += current_truck;
                    time++;
                    break;
                // 다리가 가득 차 있으면, 가장 먼저 들어온 트럭은 빼주는 조건문
                } else if (bridge.size() == bridge_length) {
                    current_weight -= bridge.poll();
                // 아직 다리에 트럭이 더 올라 갈 수 있으면,
                } else {
                    // 현재 트럭을 다리에 추가해도 무게 제한을 넘지 않으면 트럭을 추가하는 조건문
                    if (current_weight + current_truck <= weight) {
                        bridge.add(current_truck);
                        current_weight += current_truck;
                        time++;
                        break;
                    // 현재 트럭을 다리에 추가하면 무게 제한이 넘을 경우, 트럭을 대기시기는 조건문
                    } else {
                        bridge.add(0);
                        time++;
                    }
                }
            }
        }
        // 모든 트럭이 다리에 올라도, 아직 다리에 있는 트럭이 있으면 다리의 길이 만큼 시간을 더해준다
        return time + bridge_length;
    }

}