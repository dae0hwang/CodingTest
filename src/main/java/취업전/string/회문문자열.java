package 취업전.string;

import java.util.Scanner;

public class 회문문자열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int lt = 0;
        int rt = str.length() - 1;
        String lower = str.toLowerCase();

        boolean flag = true;
        String answer = "YES";
        char[] chars = lower.toCharArray();
        while (rt > lt) {
            System.out.println(chars[lt]);
            System.out.println(chars[rt]);
            //rt가 lt보다 클 때까지 진행하는데 같아진다면 끝나는 거다
            if (chars[lt] == chars[rt]) {
                System.out.println("same");
                lt++;
                rt--;
            } else {
                System.out.println("different");
                answer = "NO";
                break;
            }

        }
        System.out.println(answer);
    }

}
