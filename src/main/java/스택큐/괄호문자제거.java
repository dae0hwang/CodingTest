package 스택큐;

import java.util.Scanner;

public class 괄호문자제거 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        char[] chars = next.toCharArray();
        String answer = "";
        int cnt = 0;
        for (char aChar : chars) {
            if (aChar == '(') {
                cnt++;
            } else if (aChar == ')') {
                cnt--;
            } else if (cnt == 0) {
                answer += String.valueOf(aChar);
            }
        }
        System.out.println(answer);
    }

}
