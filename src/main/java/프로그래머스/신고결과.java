package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 신고결과 {

    public static void main(String[] args) {
        신고결과 a = new 신고결과();
        int[] solution = a.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
            new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);

    }

    public int[] solution(String[] id_list, String[] report, int k) {
        //신고 받음
        Map<String, Set<String>> reci = new HashMap<>();
        //내가 신고한 목록
        Map<String, Set<String>> doit = new HashMap<>();
        //k번 이상 한애들 가져올 수 있음
        for (String s : report) {
            String[] split = s.split(" ");
            String d = split[0];
            String r = split[1];

            Set<String> orDefault = reci.getOrDefault(r, new HashSet<>());
            orDefault.add(d);
            reci.put(r, orDefault);

            Set<String> orDefault1 = doit.getOrDefault(d, new HashSet<>());
            orDefault1.add(r);
            doit.put(d, orDefault1);
        }
//        System.out.println("reci = " + reci);
//        System.out.println("doit = " + doit);
        //이제 신고 k번 이상 받은 애들 알아보자.
        List<String> list = new ArrayList<>();
        for (String s : reci.keySet()) {
            if (reci.get(s).size() >= k) {
                list.add(s);
            }
        }
//        System.out.println("list = " + list);
        //잡았다 요놈들이제

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String d = id_list[i];
            Set<String> strings = doit.getOrDefault(d, new HashSet<>());
            int cnt = 0;
            for (String s : list) {
                if (strings.contains(s)) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
//        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
        return answer   ;
    }
}
