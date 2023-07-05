package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 나누어 {

    public static void main(String[] args) {
        나누어 a = new 나누어();
        String[] solution = a.solution(new String[]{"abce", "abcd", "cdx"}, 2);
        System.out.println(Arrays.toString(solution));
    }
    class S implements Comparable<S>{

        String str;
        char c;

        public S(String str, char c) {
            this.str = str;
            this.c = c;
        }
        @Override
        public String toString() {
            return "S{" +
                "str='" + str + '\'' +
                ", c=" + c +
                '}';
        }

        @Override
        public int compareTo(S o) {
            return this.c - o.c;
        }
    }
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        List<S> list = new ArrayList<>();
        for (String string : strings) {
            list.add(new S(string, string.charAt(n)));
        }
        Collections.sort(list);
        String[] strings1 = list.stream().map(s -> s.str).toArray(String[]::new);
        return strings1;
    }
}
