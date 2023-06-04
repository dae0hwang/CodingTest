package 프로그래머스L1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        List<Integer> result = new ArrayList<>();
        for (String[] strings : photo) {
            int sum = 0;
            for (String string : strings) {
                if (map.containsKey(string)) {
                    sum += map.get(string);
                }
            }
            result.add(sum);
        }
        int[] ints = result.stream().mapToInt(i -> i.intValue()).toArray();
        return ints;
    }
}
