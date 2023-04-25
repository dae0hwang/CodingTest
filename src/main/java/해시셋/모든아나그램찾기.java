package 해시셋;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 모든아나그램찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int m = t.length();
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
//        System.out.println(tMap);

        for (int i = 0; i < m-1; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        int answer = 0;
        int lt = 0;

        for (int rt = m-1; rt < s.length(); rt++) {
            sMap.put(s.charAt(rt), sMap.getOrDefault(s.charAt(rt), 0) + 1);
            if (sMap.equals(tMap)) {
                answer++;
            }
            //이제 lt한칸 줄여주기
            sMap.put(s.charAt(lt), sMap.getOrDefault(s.charAt(lt), 0) - 1);
            if (sMap.get(s.charAt(lt)) == 0) {
                sMap.remove(s.charAt(lt));
            }
            lt++;
        }

        System.out.println(answer);

//        System.out.println(sMap);
    }

}
