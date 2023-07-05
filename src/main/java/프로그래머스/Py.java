package 프로그래머스;

public class Py {

    public static void main(String[] args) {

    }

    boolean solution(String s) {
        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        int p = 0;
        int y = 0;
        for (char aChar : chars) {
            if (aChar == 'p') {
                p++;
            } else if (aChar == 'y') {
                y++;
            }
        }
        if (p == y) {
            return true;
        } else {
            return false;
        }
    }

}
