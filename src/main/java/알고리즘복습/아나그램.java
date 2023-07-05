package 알고리즘복습;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 아나그램 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map1.equals(map2));
    }
}
