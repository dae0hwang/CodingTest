package 취업전.복습;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = "";
        String s = str + " ";
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        System.out.println(answer);

    }
}
