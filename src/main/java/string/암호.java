package string;

import java.util.Scanner;

public class 암호 {

    public static char solution(String str) {
        String binary = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '#') {
                binary += "1";
            } else {
                binary += "0";
            }

        }
        int i1 = Integer.parseInt(binary, 2);
        char result = (char) i1;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String answer = "";
        int st = 0;
        int end = 6;
        for (int i = 0; i < n; i++) {
            int a = st + 7 * i;
            int b = end + 7 * i;
            String substring = str.substring(a, b + 1);
            char solution = solution(substring);
            answer += solution;

        }

        System.out.println(answer);


    }

}
