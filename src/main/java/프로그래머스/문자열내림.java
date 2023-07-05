package 프로그래머스;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열내림 {

    public static void main(String[] args) {
        문자열내림 a = new 문자열내림();
        a.solution("Zbcdefg");
    }

    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        String s1 = stringBuilder.append(chars).reverse().toString();
        return s1;
    }
}
