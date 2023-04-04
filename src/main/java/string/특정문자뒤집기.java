package string;

import java.util.Arrays;
import java.util.Scanner;

public class 특정문자뒤집기 {

    public static String solution(String str) {
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = s.length - 1;
        while (lt < rt) {
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                //lt와 rt가 지칭하는 char이 모두 알파벳일 때, 서로 교환한다.
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
