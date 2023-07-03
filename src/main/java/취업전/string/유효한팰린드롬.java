package 취업전.string;

import java.util.Scanner;

public class 유효한팰린드롬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = str.toUpperCase().replaceAll("[^A-Z]", "");
        System.out.println(answer);
    }

}
