package study.lv1;

public class _57신규아이디추천 {

    public static void main(String[] args) {
        _57신규아이디추천 t = new _57신규아이디추천();
        String new_id = "abcdefghijklmn.p";
        System.out.println(t.solution(new_id));
    }

    public String solution(String new_id) {
        String answer = new_id.toLowerCase();

        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        answer = answer.replaceAll("[.]{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");

        if (answer.equals("")) {
            answer += "a";
        }

        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }

        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }

        return answer;
    }

}