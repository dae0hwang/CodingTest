package string;

import java.util.Scanner;

public class 문자열찾기 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        String cha = in.nextLine();
        String lower = str.toLowerCase();
        String lowCha = cha.toLowerCase();
        String[] split = lower.split("");
        int answer = 0;
        for (String s : split) {
            if (s.equals(lowCha)) {
                answer++;
            }
        }
        System.out.println(answer);
    }

}
