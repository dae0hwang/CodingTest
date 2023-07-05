package 알고리즘복습;

import java.util.Arrays;

public class 가장짧은거리 {

    public static void main(String[] args) {
        String str = "teachermode";
        char c = 'e';
        char[] chars = str.toCharArray();
        int[] dy = new int[chars.length];
        Arrays.fill(dy, Integer.MAX_VALUE);
        int dis = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != c) {
                dis++;
                dy[i] = Math.min(dy[i], dis);
            } else {
                dis = 0;
                dy[i] = 0;
            }
        }
        System.out.println(Arrays.toString(dy));
        dis = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != c) {
                dis++;
                dy[i] = Math.min(dy[i], dis);
            } else {
                dis = 0;
                dy[i] = 0;
            }
        }
        System.out.println(Arrays.toString(dy));
    }

}
