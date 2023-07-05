package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 같은숫자는싫어 {

    public static void main(String[] args) {
        같은숫자는싫어 a = new 같은숫자는싫어();
        System.out.println(Arrays.toString(a.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));

    }

    public int[] solution(int []arr) {

        int past = -1;
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (past != i) {
                past = i;
                list.add(i);
            }
        }
        int[] ints = list.stream().mapToInt((i) -> i).toArray();
        return ints;
    }


}
