package 프로그래머스L1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의전당 {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        int minNum = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i : score) {
            minNum = Math.min(i, minNum);
            list.add(i);
            Collections.sort(list, ((o1, o2) -> o2 - o1));
            if (list.size() < k+1) {
                result.add(minNum);
            } else {
                result.add(list.get(k-1));
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {

    }
}
