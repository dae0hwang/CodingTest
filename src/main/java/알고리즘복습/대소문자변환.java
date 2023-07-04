package 알고리즘복습;

import java.util.Arrays;
import java.util.Scanner;

public class 대소문자변환 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;

        while (lt <= rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            }
            if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            }
            if (Character.isAlphabetic(chars[lt]) && Character.isAlphabetic(chars[rt])) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }
        System.out.println(Arrays.toString(chars));
    }
}
