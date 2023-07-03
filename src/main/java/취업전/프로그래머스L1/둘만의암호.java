package 취업전.프로그래머스L1;

import java.util.List;
import java.util.stream.Collectors;

public class 둘만의암호 {

    public String solution(String s, String skip, int index) {
        String result = "";

        char[] sChars = s.toCharArray();
        List<Character> collect = skip.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println(sChars);
        for (char sChar : sChars) {
            int newIndex = index;
            char ss = sChar;
            while (newIndex > 0) {
                ss = (char) (ss + 1);
                if (collect.contains(ss)) {
                    continue;
                }
                newIndex--;
            }
            if ((int) ss > 122) {
                ss = (char) ( ss - 26);
            }
            result += ss;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        String result = "";

        char[] sChars = s.toCharArray();
        List<Character> collect = skip.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println(sChars);
        for (char sChar : sChars) {
            int newIndex = index;
            char ss = sChar;
            while (newIndex > 0) {
                ss = (char) (ss + 1);
                if (collect.contains(ss)) {
                    continue;
                }
                newIndex--;
            }
            if ((int) ss > 122) {
                ss = (char) ( ss - 26);
            }
            result += s;
        }
    }

}
