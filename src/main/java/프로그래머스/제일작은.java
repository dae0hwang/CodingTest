package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 제일작은 {

    public static void main(String[] args) {
        제일작은 a = new 제일작은();
        System.out.println(Arrays.toString(a.solution(new int[]{10})));
    }

    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                minIndex = i;
                min = arr[i];
            }
        }
//        System.out.println(minIndex);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == minIndex) {
                continue;
            }
            list.add(arr[i]);
        }
        if (list.size() == 0) {
            return new int[]{-1};
        } else {
            return list.stream().mapToInt(i -> i).toArray();
        }
    }

}
