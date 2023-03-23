package study.lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _61대충만든자판 {

    public static void main(String[] args) {
        _61대충만든자판 t = new _61대충만든자판();
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};
        for (int x : t.solution(keymap, targets)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Set<String> set = new HashSet<>(Arrays.asList(keymap));

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                int n = 101;

                for (String x : set) {
                    int idx = x.indexOf(targets[i].charAt(j));
                    if (idx == -1) {
                        continue;
                    } else if (idx < n) {
                        n = idx;
                    }
                }

                if (n == 101) {
                    answer[i] = -1;
                    break;
                } else {
                    answer[i] += (n + 1);
                }
            }
        }
        return answer;
    }


}