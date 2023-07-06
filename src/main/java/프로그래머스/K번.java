package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K번 {

    public static void main(String[] args) {
        K번 a = new K번();
        int[] solution = a.solution(new int[]{1, 5, 2, 6, 3, 7, 4},
            new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        System.out.println(Arrays.toString(solution));
    }
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int start = command[0];
            int end = command[1];
            int k = command[2];
            List<Integer> list = new ArrayList<>();
            for (int j = start - 1; j < end; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            Integer integer = list.get(k - 1);
            answer[i] = integer;
        }
        return answer;
    }
}
