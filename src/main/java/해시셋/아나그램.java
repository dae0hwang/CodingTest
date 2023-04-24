package 해시셋;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 아나그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        String answer = "YES";
        for (char aChar : aChars) {
            map.put(aChar, map.getOrDefault(aChar, 0)+1);
        }
        for (char bChar : bChars) {
            if (!map.containsKey(bChar) || map.get(bChar) == 0) {
                answer = "NO";
                break;
            } else {
                map.put(bChar, map.get(bChar) - 1);
            }
        }
        System.out.println(answer);
        System.out.println(map);
    }
}
