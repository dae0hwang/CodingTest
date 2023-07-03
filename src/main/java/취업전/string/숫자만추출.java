package 취업전.string;

import java.util.Scanner;

public class 숫자만추출 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();

        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                System.out.println(aChar);
            }
        }
    }

}
