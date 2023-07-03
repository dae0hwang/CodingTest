package 취업전.복습;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        String answer = "YES";
        //먼저 첫번 째 문자열로 문자 별로 개수 값으로 가지고 있는 맵 만들기
        for (char aChar : aChars) {
            map.put(aChar, map.getOrDefault(aChar, 0)+1);
        }

        for (char bChar : bChars) {
            //두번 째 문자열의 문자가 없거나,값이 0이면 NO 출력
            if (!map.containsKey(bChar) || map.get(bChar) == 0) {
                answer = "NO";
                break;
            } else {
                map.put(bChar, map.get(bChar) - 1);
            }
        }
        System.out.println(answer);
    }

}
