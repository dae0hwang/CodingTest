package 취업전.프로그래머스L1;

public class 문자열나누기 {
    public int solution(String s) {
        int answer = 0;
        char[] chars = s.toCharArray();
        boolean first = true;
        Character f = null;
        int a = 0;
        int b = 0;
        for (char aChar : chars) {
            if (first) {
                f = aChar;
                first = false;
                a++;
            } else {
                if (f.equals(aChar)) {
                    a++;
                } else {
                    b++;
                }
                if (a == b) {
                    answer++;
                    first = true;
                    a = 0;
                    b = 0;
                }
            }
        }
        if (a != 0) {
            answer++;
        }
        return answer;
    }

}
