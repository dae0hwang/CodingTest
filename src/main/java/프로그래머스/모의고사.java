package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {

    public static void main(String[] args) {

    }

    public int[] solution(int[] answers) {
        int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5,}
        };
        int[] hit = new int[3];

        for (int i = 0; i < patterns.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (patterns[i][j % patterns[i].length] == answers[j]) {
                    hit[i]++;
                }
            }
        }
        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < hit.length; i++) {
            if (hit[i] == max) {
                list.add(i+1);
            }
        }
        int[] ints = list.stream().mapToInt(Integer::intValue).toArray();
        return ints;
    }

    static class Person {

        int number;
        int count;
        int[] arr;

        public Person(int number, int count, int[] arr) {
            this.number = number;
            this.count = count;
            this.arr = arr;
        }

        @Override
        public String toString() {
            return "Person{" +
                "number=" + number +
                ", count=" + count +
                ", arr=" + Arrays.toString(arr) +
                '}';
        }
    }
}
