package 프로그래머스L1;

public class 크기가작은부분문자열 {

    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        String[] split = t.split("");

        for (int i = length - 1; i < split.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; j++) {
                sb.append(split[j+i+1-length]);

            }
            if (Integer.valueOf(sb.toString()) <= Integer.valueOf(p)) {
                answer++;
            }
        }
        return answer;
    }


}
