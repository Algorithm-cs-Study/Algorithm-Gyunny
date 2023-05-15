package study2.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class _003전화번호목록 {

    public static void main(String[] args) throws IOException {
        _003전화번호목록 t = new _003전화번호목록();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] phone_book = new String[st.countTokens()];
        int len = phone_book.length;
        for (int i = 0; i < len; i++) {
            phone_book[i] = st.nextToken();
        }
        System.out.println(t.solution(phone_book));
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = Arrays.stream(phone_book).collect(Collectors.toCollection(HashSet::new));
        for (String pb : phone_book) {
            for (int j = 1; j < pb.length(); j++) {
                if (set.contains(pb.subSequence(0, j)))
                    answer = false;
            }
        }
        return answer;
    }

}