package string;

import java.util.Scanner;

public class 대소문자변환 {
    public static void main(String[] args){
        String str = "SpEdCaR";
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        System.out.println(sb.toString());
    }
}
