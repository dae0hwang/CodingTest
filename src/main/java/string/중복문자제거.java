package string;

import java.util.Scanner;

public class 중복문자제거 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            //해당 문자열의 각 문자가 가장 처음 등장하는 알파벳이라면 answer에 추가한다.
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
