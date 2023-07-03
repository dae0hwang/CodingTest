package 취업전.프로그래머스L1;

import java.util.HashMap;
import java.util.Map;

public class 대충만든자판 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for (String s : keymap) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (map.containsKey(chars[i])) {
                    int min = Math.min(map.get(chars[i]), i + 1);
                    map.put(chars[i], min);
                } else {
                    map.put(chars[i], i + 1);
                }
            }
        }
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;

            for (char c : targets[i].toCharArray()) {
                sum += map.get(c);
            }
            if (sum == 0) {
                answer[i] = -1;
            } else {
                answer[i] = sum;
            }
        }
        return answer;
    }
}
