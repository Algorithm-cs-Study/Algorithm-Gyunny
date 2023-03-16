package study.lv1;

public class _53옹알이 {

    public static void main(String[] args) {
        _53옹알이 t = new _53옹알이();
        String[] babbling = {"ayaye", "uuu", "yemawoo", "ayaayaa"};
        System.out.println(t.solution(babbling));
    }

    public int solution(String[] babbling) {
        int answer = 0;

        for(int i=0; i<babbling.length; i++){

            if (babbling[i].contains("ayaaya") ||
                    babbling[i].contains("yeye") ||
                    babbling[i].contains("mama") ||
                    babbling[i].contains("woowoo")) {
                continue;
            }

            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace(" ", "");

            if(babbling[i].length()==0){
                answer++;
            }
        }

        return answer;
    }

}