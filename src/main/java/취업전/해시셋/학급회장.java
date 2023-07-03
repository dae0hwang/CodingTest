package 취업전.해시셋;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class 학급회장 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        Map<String, Integer> map = new HashMap<>();
//        map.put("A", 0);
//        map.put("B", 0);
//        map.put("C", 0);
//        map.put("D", 0);
//        map.put("E", 0);
        String[] split = str.split("");
        for (String s : split) {
            Integer orDefault = map.getOrDefault(s, 0);
            map.put(s, orDefault + 1);
        }
        int answer = 0;
        String result = "";
        for (String key : map.keySet()) {
            if (answer < map.get(key)) {
                answer= map.get(key);
                result = key;
            }
        }
        System.out.println(result);

    }

}
