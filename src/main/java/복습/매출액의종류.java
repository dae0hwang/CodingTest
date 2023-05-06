package 복습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class 매출액의종류 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            //4개 값 구해야 하니깐 3개만 고고
            //k까지 넣어놓고 일단 answer에 추가
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> answer = new ArrayList<>();
        answer.add(map.size());

        for (int i = k; i < n; i++) {
            //일단 뒤에것 하나 빼자
            map.put(arr[i - k], map.get(arr[i - k]) - 1);
            if (map.get(arr[i - k]) == 0) {
                map.remove(arr[i - k]);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            System.out.println(map);
            answer.add(map.size());
            System.out.println("answer="+answer);
        }

    }

}
