package study.lv1;

import java.util.HashSet;
import java.util.Set;

public class _60둘만의암호 {

    public static void main(String[] args) {
        _60둘만의암호 t = new _60둘만의암호();
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println(t.solution(s, skip, index));
    }

    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 1;
            while (count <= index) {
                ++c;
                if (c > 'z') {
                    c -= 26;
                }
                if (skip.contains(c + "")) {
                    continue;
                } else {
                    count++;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public String solution2(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();
        char[] sList = s.toCharArray();

        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        for (int i = 0; i < sList.length; i++) {
            int cnt = 0;
            for (int k = 1; k <= index; k++) {
                if (skipSet.contains((char) (sList[i] + k))) {
                    cnt++;
                }
            }

            int code = sList[i] + index + cnt;
            if (code > 122) {
                code -= 26;
            }
            sb.append((char) code);
        }
        return sb.toString();
    }

    // 시간 복잡도 안좋음
    public String solution3(String s, String skip, int index) {
        String answer = "";
        char[] sList = s.toCharArray();
        char[] skipList = skip.toCharArray();
        int cnt = 0;

        for (int i = 0; i < sList.length; i++) {
            for (int j = 0; j < skipList.length; j++) {
                for (int k = 1; k <= index; k++) {
                    if ((int) sList[i] + k == (int) skipList[j]) {
                        cnt++;
                    }
                }
            }
            if ((int) sList[i] + index + cnt <= 122) {
                answer += (char) ((int) sList[i] + index + cnt);
            } else {
                answer += (char) ((int) sList[i] + index + cnt - 26);
            }
            cnt = 0;
        }

        return answer;
    }

}