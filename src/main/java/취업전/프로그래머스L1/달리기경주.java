package 취업전.프로그래머스L1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class 달리기경주 {
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> nameKey = new HashMap<>();
        Map<Integer, String> integerKey = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            nameKey.put(players[i], i);
            integerKey.put(i, players[i]);
        }
        for (String c : callings) {
            //먼저 찾아요
            String nowMember = c;
            int n = nameKey.get(c);
            String proceedMember = integerKey.get(n - 1);
            int pn = n - 1;
            integerKey.put(n, proceedMember);
            integerKey.put(pn, nowMember);
            nameKey.put(nowMember, pn);
            nameKey.put(proceedMember, n);
        }

        String[] result = integerKey.values().stream().toArray((size) -> {return new String[size];});
        return result;
//        for (int i = 0; i < players.length; i++) {
//            answer[i] = integerKey.get(i);
//        }
//        return answer;
    }

    public static void main(String[] args) {
        Map<Integer, String> integerKey = new HashMap<>();
        //이런 다양한 형식으로 toArray 파라미터에 적용할 수 있다.
        //size를 받는 다는 것이 특이한 형태이다.
        String[] result1 = integerKey.values().stream().toArray((size) -> {
            return new String[size];});
        String[] result2 = integerKey.values().stream().toArray(size ->  new String[size]);
        String[] result3 = integerKey.values().stream().toArray(String[]::new);
    }
}
